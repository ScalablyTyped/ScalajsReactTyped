package typingsJapgolly.wixUiCore

import typingsJapgolly.wixUiCore.anon.Address
import typingsJapgolly.wixUiCore.anon.Description
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEsSrcClientsAtlasTestUtilsMod {
  
  object getPlaceRequestMock {
    
    @JSImport("wix-ui-core/dist/es/src/clients/Atlas/testUtils", "getPlaceRequestMock")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("wix-ui-core/dist/es/src/clients/Atlas/testUtils", "getPlaceRequestMock.placeId")
    @js.native
    def placeId: String = js.native
    inline def placeId_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("placeId")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("wix-ui-core/dist/es/src/clients/Atlas/testUtils", "metaSiteInstaceMock")
  @js.native
  val metaSiteInstaceMock: /* "some-meta-site-instance" */ String = js.native
  
  object predictRequestMock {
    
    @JSImport("wix-ui-core/dist/es/src/clients/Atlas/testUtils", "predictRequestMock")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("wix-ui-core/dist/es/src/clients/Atlas/testUtils", "predictRequestMock.countryCodes")
    @js.native
    def countryCodes: js.Array[String] = js.native
    inline def countryCodes_=(x: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("countryCodes")(x.asInstanceOf[js.Any])
    
    @JSImport("wix-ui-core/dist/es/src/clients/Atlas/testUtils", "predictRequestMock.input")
    @js.native
    def input: String = js.native
    inline def input_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("input")(x.asInstanceOf[js.Any])
  }
  
  object successfulGetPlaceResponseMock {
    
    @JSImport("wix-ui-core/dist/es/src/clients/Atlas/testUtils", "successfulGetPlaceResponseMock")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("wix-ui-core/dist/es/src/clients/Atlas/testUtils", "successfulGetPlaceResponseMock.place")
    @js.native
    def place: Address = js.native
    inline def place_=(x: Address): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("place")(x.asInstanceOf[js.Any])
  }
  
  object successfulPredictResponseMock {
    
    @JSImport("wix-ui-core/dist/es/src/clients/Atlas/testUtils", "successfulPredictResponseMock")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("wix-ui-core/dist/es/src/clients/Atlas/testUtils", "successfulPredictResponseMock.predictions")
    @js.native
    def predictions: js.Array[Description] = js.native
    inline def predictions_=(x: js.Array[Description]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("predictions")(x.asInstanceOf[js.Any])
  }
}
