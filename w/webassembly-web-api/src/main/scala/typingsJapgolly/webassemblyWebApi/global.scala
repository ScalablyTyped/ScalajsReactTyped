package typingsJapgolly.webassemblyWebApi

import org.scalajs.dom.Response
import typingsJapgolly.webassemblyWebApi.WebAssembly.Module
import typingsJapgolly.webassemblyWebApi.WebAssembly.ResultObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object WebAssembly {
    
    @JSGlobal("WebAssembly")
    @js.native
    val ^ : js.Any = js.native
    
    inline def compileStreaming(source: js.Promise[Response]): js.Promise[Module] = ^.asInstanceOf[js.Dynamic].applyDynamic("compileStreaming")(source.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Module]]
    inline def compileStreaming(source: Response): js.Promise[Module] = ^.asInstanceOf[js.Dynamic].applyDynamic("compileStreaming")(source.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Module]]
    
    inline def instantiateStreaming(source: js.Promise[Response]): js.Promise[ResultObject] = ^.asInstanceOf[js.Dynamic].applyDynamic("instantiateStreaming")(source.asInstanceOf[js.Any]).asInstanceOf[js.Promise[ResultObject]]
    inline def instantiateStreaming(source: js.Promise[Response], importObject: js.Object): js.Promise[ResultObject] = (^.asInstanceOf[js.Dynamic].applyDynamic("instantiateStreaming")(source.asInstanceOf[js.Any], importObject.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ResultObject]]
    inline def instantiateStreaming(source: Response): js.Promise[ResultObject] = ^.asInstanceOf[js.Dynamic].applyDynamic("instantiateStreaming")(source.asInstanceOf[js.Any]).asInstanceOf[js.Promise[ResultObject]]
    inline def instantiateStreaming(source: Response, importObject: js.Object): js.Promise[ResultObject] = (^.asInstanceOf[js.Dynamic].applyDynamic("instantiateStreaming")(source.asInstanceOf[js.Any], importObject.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ResultObject]]
  }
}
