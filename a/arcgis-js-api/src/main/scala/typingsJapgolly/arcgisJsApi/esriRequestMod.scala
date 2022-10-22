package typingsJapgolly.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.arcgisJsApi.esri.RequestOptions
import typingsJapgolly.arcgisJsApi.esri.RequestResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esriRequestMod extends Shortcut {
  
  @JSImport("esri/request", JSImport.Namespace)
  @js.native
  val ^ : js.Function2[
    /* url */ String, 
    /* options */ js.UndefOr[RequestOptions], 
    js.Promise[RequestResponse]
  ] = js.native
  
  type _To = js.Function2[
    /* url */ String, 
    /* options */ js.UndefOr[RequestOptions], 
    js.Promise[RequestResponse]
  ]
  
  /* This means you don't have to write `^`, but can instead just say `esriRequestMod.foo` */
  override def _to: js.Function2[
    /* url */ String, 
    /* options */ js.UndefOr[RequestOptions], 
    js.Promise[RequestResponse]
  ] = ^
}
