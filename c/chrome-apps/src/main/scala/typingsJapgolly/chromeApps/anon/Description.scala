package typingsJapgolly.chromeApps.anon

import typingsJapgolly.chromeApps.chrome.ToStringLiteral
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Description extends StObject {
  
  var description: String
  
  var state: ToStringLiteral[
    /* import warning: importer.ImportType#apply Failed type conversion: typeof ServiceStatus */ js.Any, 
    /* keyof typeof ServiceStatus */ String, 
    /* import warning: importer.ImportType#apply Failed type conversion: keyof typeof ServiceStatus extends keyof typeof ServiceStatus ? std.Exclude<keyof typeof ServiceStatus, typeof ServiceStatus[keyof typeof ServiceStatus]> : never */ js.Any
  ]
}
object Description {
  
  inline def apply(
    description: String,
    state: ToStringLiteral[
      /* import warning: importer.ImportType#apply Failed type conversion: typeof ServiceStatus */ js.Any, 
      /* keyof typeof ServiceStatus */ String, 
      /* import warning: importer.ImportType#apply Failed type conversion: keyof typeof ServiceStatus extends keyof typeof ServiceStatus ? std.Exclude<keyof typeof ServiceStatus, typeof ServiceStatus[keyof typeof ServiceStatus]> : never */ js.Any
    ]
  ): Description = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
    __obj.asInstanceOf[Description]
  }
  
  extension [Self <: Description](x: Self) {
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setState(
      value: ToStringLiteral[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof ServiceStatus */ js.Any, 
          /* keyof typeof ServiceStatus */ String, 
          /* import warning: importer.ImportType#apply Failed type conversion: keyof typeof ServiceStatus extends keyof typeof ServiceStatus ? std.Exclude<keyof typeof ServiceStatus, typeof ServiceStatus[keyof typeof ServiceStatus]> : never */ js.Any
        ]
    ): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
  }
}
