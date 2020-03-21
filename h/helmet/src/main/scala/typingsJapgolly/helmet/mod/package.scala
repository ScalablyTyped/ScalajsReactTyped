package typingsJapgolly.helmet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type HelmetCspDirectiveValue = java.lang.String | typingsJapgolly.helmet.mod.IHelmetContentSecurityPolicyDirectiveFunction
  /* Rewritten from type alias, can be one of: 
    - java.lang.String
    - typingsJapgolly.helmet.helmetStrings.script
    - typingsJapgolly.helmet.helmetStrings.style
  */
  type HelmetCspRequireSriForValue = typingsJapgolly.helmet.mod._HelmetCspRequireSriForValue | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - java.lang.String
    - typingsJapgolly.helmet.helmetStrings.`allow-forms`
    - typingsJapgolly.helmet.helmetStrings.`allow-modals`
    - typingsJapgolly.helmet.helmetStrings.`allow-orientation-lock`
    - typingsJapgolly.helmet.helmetStrings.`allow-pointer-lock`
    - typingsJapgolly.helmet.helmetStrings.`allow-popups-to-escape-sandbox`
    - typingsJapgolly.helmet.helmetStrings.`allow-popups`
    - typingsJapgolly.helmet.helmetStrings.`allow-presentation`
    - typingsJapgolly.helmet.helmetStrings.`allow-same-origin`
    - typingsJapgolly.helmet.helmetStrings.`allow-scripts`
    - typingsJapgolly.helmet.helmetStrings.`allow-top-navigation`
  */
  type HelmetCspSandboxDirective = typingsJapgolly.helmet.mod._HelmetCspSandboxDirective | java.lang.String
  type IHelmetContentSecurityPolicyDirectiveFunction = js.Function2[
    /* req */ typingsJapgolly.express.mod.Request_[typingsJapgolly.expressServeStaticCore.mod.ParamsDictionary], 
    /* res */ typingsJapgolly.express.mod.Response_, 
    java.lang.String
  ]
  type IHelmetSetIfFunction = js.Function2[
    /* req */ typingsJapgolly.express.mod.Request_[typingsJapgolly.expressServeStaticCore.mod.ParamsDictionary], 
    /* res */ typingsJapgolly.express.mod.Response_, 
    scala.Boolean
  ]
}
