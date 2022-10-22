package typingsJapgolly.storybookCoreCommon.anon

import org.scalablytyped.runtime.Instantiable1
import typingsJapgolly.express.mod.Router
import typingsJapgolly.node.httpMod.IncomingMessage
import typingsJapgolly.node.httpMod.Server
import typingsJapgolly.node.httpMod.ServerResponse
import typingsJapgolly.node.nodeColonnetMod.Socket
import typingsJapgolly.node.processMod.global.NodeJS.HRTime
import typingsJapgolly.std.ReturnType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Options extends StObject {
  
  var options: typingsJapgolly.storybookCoreCommon.distTs3Dot9TypesMod.Options
  
  var router: Router
  
  var server: Server[
    Instantiable1[/* socket */ Socket, IncomingMessage], 
    Instantiable1[
      /* import warning: RewrittenClass.unapply cls was tparam Request */ /* req */ Any, 
      ServerResponse[IncomingMessage]
    ]
  ]
  
  var startTime: ReturnType[HRTime]
}
object Options {
  
  inline def apply(
    options: typingsJapgolly.storybookCoreCommon.distTs3Dot9TypesMod.Options,
    router: Router,
    server: Server[
      Instantiable1[/* socket */ Socket, IncomingMessage], 
      Instantiable1[
        /* import warning: RewrittenClass.unapply cls was tparam Request */ /* req */ Any, 
        ServerResponse[IncomingMessage]
      ]
    ],
    startTime: ReturnType[HRTime]
  ): Options = {
    val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any], router = router.asInstanceOf[js.Any], server = server.asInstanceOf[js.Any], startTime = startTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
  
  extension [Self <: Options](x: Self) {
    
    inline def setOptions(value: typingsJapgolly.storybookCoreCommon.distTs3Dot9TypesMod.Options): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setRouter(value: Router): Self = StObject.set(x, "router", value.asInstanceOf[js.Any])
    
    inline def setServer(
      value: Server[
          Instantiable1[/* socket */ Socket, IncomingMessage], 
          Instantiable1[
            /* import warning: RewrittenClass.unapply cls was tparam Request */ /* req */ Any, 
            ServerResponse[IncomingMessage]
          ]
        ]
    ): Self = StObject.set(x, "server", value.asInstanceOf[js.Any])
    
    inline def setStartTime(value: ReturnType[HRTime]): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
  }
}
