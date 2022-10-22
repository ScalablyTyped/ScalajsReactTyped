package typingsJapgolly.babylonjs.global.BABYLON

import org.scalajs.dom.XMLHttpRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.WebRequest")
@js.native
open class WebRequest ()
  extends StObject
     with typingsJapgolly.babylonjs.BABYLON.WebRequest {
  
  /**
    * Returns client's response url
    */
  /* CompleteClass */
  var responseURL: String = js.native
  
  /**
    * Returns client's status
    */
  /* CompleteClass */
  var status: Double = js.native
  
  /**
    * Returns client's status as a text
    */
  /* CompleteClass */
  var statusText: String = js.native
}
/* static members */
object WebRequest {
  
  @JSGlobal("BABYLON.WebRequest")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Custom HTTP Request Headers to be sent with XMLHttpRequests
    * i.e. when loading files, where the server/service expects an Authorization header
    */
  @JSGlobal("BABYLON.WebRequest.CustomRequestHeaders")
  @js.native
  def CustomRequestHeaders: org.scalablytyped.runtime.StringDictionary[String] = js.native
  inline def CustomRequestHeaders_=(x: org.scalablytyped.runtime.StringDictionary[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CustomRequestHeaders")(x.asInstanceOf[js.Any])
  
  /**
    * Add callback functions in this array to update all the requests before they get sent to the network
    */
  @JSGlobal("BABYLON.WebRequest.CustomRequestModifiers")
  @js.native
  def CustomRequestModifiers: js.Array[js.Function2[/* request */ XMLHttpRequest, /* url */ String, Unit]] = js.native
  inline def CustomRequestModifiers_=(x: js.Array[js.Function2[/* request */ XMLHttpRequest, /* url */ String, Unit]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CustomRequestModifiers")(x.asInstanceOf[js.Any])
  
  @JSGlobal("BABYLON.WebRequest.SkipRequestModificationForBabylonCDN")
  @js.native
  def SkipRequestModificationForBabylonCDN: Boolean = js.native
  inline def SkipRequestModificationForBabylonCDN_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SkipRequestModificationForBabylonCDN")(x.asInstanceOf[js.Any])
}
