import jvg.dexma.DexmaRestFacade;

import java.io.IOException;

public class main {
  public static void main(String[] args) {
    DexmaRestFacade drf =  new DexmaRestFacade("cff216bbcfc55e1d5820");
 //   DexmaRestFacade drf =  new DexmaRestFacade("c0fd279531e5ab806330");


    System.out.println(drf.doGetRequest("v3/locations"));
    System.out.println(drf.doGetRequest("v3/readings?device_id=107643&operation=DELTA&parameter_key=EACTIVE&resolution=D&from=2016-05-08T00:00:00&to=2018-10-09T23:59:59"));

//    try {
//  //    System.out.println(drf.getAllDeployments());
//
//      System.out.println(drf.getAllDevices());
//
//
//    } catch (IOException e) {
//      e.printStackTrace();
//    }
  }
}
