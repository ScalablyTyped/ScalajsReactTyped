package typingsJapgolly.coreJs

import org.scalablytyped.runtime.TopLevel
import typingsJapgolly.std.PropertyDescriptor
import typingsJapgolly.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("core-js/fn/reflect/define-property", JSImport.Namespace)
@js.native
object reflectDefinePropertyMod
  extends TopLevel[
      js.Function3[
        /* target */ js.Any, 
        /* propertyKey */ PropertyKey, 
        /* attributes */ PropertyDescriptor, 
        Boolean
      ]
    ]

