package typingsJapgolly.babylonjs.global.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object FileToolsOptions {
  
  @JSGlobal("BABYLON.FileToolsOptions")
  @js.native
  val ^ : js.Any = js.native
  
  @JSGlobal("BABYLON.FileToolsOptions.BaseUrl")
  @js.native
  def BaseUrl: String = js.native
  inline def BaseUrl_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BaseUrl")(x.asInstanceOf[js.Any])
  
  @JSGlobal("BABYLON.FileToolsOptions.CorsBehavior")
  @js.native
  def CorsBehavior: String | (js.Function1[/* url */ String | js.Array[String], String]) = js.native
  inline def CorsBehavior_=(x: String | (js.Function1[/* url */ String | js.Array[String], String])): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CorsBehavior")(x.asInstanceOf[js.Any])
  
  inline def DefaultRetryStrategy(url: String, request: typingsJapgolly.babylonjs.BABYLON.WebRequest, retryIndex: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("DefaultRetryStrategy")(url.asInstanceOf[js.Any], request.asInstanceOf[js.Any], retryIndex.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def PreprocessUrl(url: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("PreprocessUrl")(url.asInstanceOf[js.Any]).asInstanceOf[String]
}
