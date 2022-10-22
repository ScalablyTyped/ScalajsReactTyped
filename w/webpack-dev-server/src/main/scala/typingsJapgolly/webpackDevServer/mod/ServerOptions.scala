package typingsJapgolly.webpackDevServer.mod

import org.scalablytyped.runtime.Instantiable1
import typingsJapgolly.node.nodeColonhttpMod.ServerResponse
import typingsJapgolly.webpackDevServer.anon.Plain
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ServerOptions
  extends StObject
     with typingsJapgolly.node.httpsMod.ServerOptions[
      Instantiable1[
        /* socket */ typingsJapgolly.node.nodeColonnetMod.Socket, 
        typingsJapgolly.node.nodeColonhttpMod.IncomingMessage
      ], 
      Instantiable1[
        /* import warning: RewrittenClass.unapply cls was tparam Request */ /* req */ Any, 
        ServerResponse[typingsJapgolly.node.httpMod.IncomingMessage]
      ]
    ] {
  
  var spdy: js.UndefOr[Plain] = js.undefined
}
object ServerOptions {
  
  inline def apply(): ServerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ServerOptions]
  }
  
  extension [Self <: ServerOptions](x: Self) {
    
    inline def setSpdy(value: Plain): Self = StObject.set(x, "spdy", value.asInstanceOf[js.Any])
    
    inline def setSpdyUndefined: Self = StObject.set(x, "spdy", js.undefined)
  }
}
