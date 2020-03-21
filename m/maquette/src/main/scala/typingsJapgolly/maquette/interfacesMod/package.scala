package typingsJapgolly.maquette

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object interfacesMod {
  type EventHandlerInterceptor = js.Function4[
    /* propertyName */ java.lang.String, 
    /* eventHandler */ js.Function, 
    /* domNode */ org.scalajs.dom.raw.Node, 
    /* properties */ typingsJapgolly.maquette.interfacesMod.VNodeProperties, 
    js.UndefOr[js.Function]
  ]
  type ProjectorPerformanceLogger = js.Function2[
    /* eventType */ typingsJapgolly.maquette.interfacesMod.PerformanceLoggerEvent, 
    /* trigger */ js.UndefOr[typingsJapgolly.std.Event_], 
    scala.Unit
  ]
  /* Rewritten from type alias, can be one of: 
    - java.lang.String
    - typingsJapgolly.maquette.interfacesMod.VNode
    - typingsJapgolly.maquette.interfacesMod.VNodeChildren
    - typingsJapgolly.maquette.maquetteBooleans.`false`
    - scala.Null
    - `js.undefined`
  */
  type VNodeChild = js.UndefOr[
    typingsJapgolly.maquette.interfacesMod._VNodeChild | java.lang.String | scala.Null
  ]
}
