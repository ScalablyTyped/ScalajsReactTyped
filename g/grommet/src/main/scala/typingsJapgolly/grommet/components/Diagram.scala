package typingsJapgolly.grommet.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.Js.MountedWithRawType
import japgolly.scalajs.react.component.Js.RawMounted
import japgolly.scalajs.react.component.Js.UnmountedSimple
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.SVGSVGElement
import typingsJapgolly.grommet.AnonAnchor
import typingsJapgolly.grommet.diagramMod.DiagramProps
import typingsJapgolly.react.mod.ClassAttributes
import typingsJapgolly.react.mod.SVGAttributes
import typingsJapgolly.react.mod.SVGProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Diagram {
  def apply(
    connections: js.Array[AnonAnchor],
    ClassAttributes: ClassAttributes[SVGSVGElement] = null,
    SVGAttributes: SVGAttributes[SVGSVGElement] = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedSimple[
    DiagramProps with SVGProps[SVGSVGElement], 
    MountedWithRawType[
      DiagramProps with SVGProps[SVGSVGElement], 
      js.Object, 
      RawMounted[DiagramProps with SVGProps[SVGSVGElement], js.Object]
    ]
  ] = {
    val __obj = js.Dynamic.literal(connections = connections.asInstanceOf[js.Any])
  
      if (ClassAttributes != null) js.Dynamic.global.Object.assign(__obj, ClassAttributes)
    if (SVGAttributes != null) js.Dynamic.global.Object.assign(__obj, SVGAttributes)
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsComponent[
  typingsJapgolly.grommet.diagramMod.DiagramProps with typingsJapgolly.react.mod.SVGProps[org.scalajs.dom.raw.SVGSVGElement], 
  japgolly.scalajs.react.Children.Varargs, 
  js.Object](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.grommet.diagramMod.DiagramProps with typingsJapgolly.react.mod.SVGProps[org.scalajs.dom.raw.SVGSVGElement]])(children: _*)
  }
  @JSImport("grommet", "Diagram")
  @js.native
  object componentImport extends js.Object
  
}

