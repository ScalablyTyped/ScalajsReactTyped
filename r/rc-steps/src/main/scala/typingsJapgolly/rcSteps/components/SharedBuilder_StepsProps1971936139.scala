package typingsJapgolly.rcSteps.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.React.Node
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.rcSteps.anon.Description
import typingsJapgolly.rcSteps.anon.Index
import typingsJapgolly.rcSteps.libInterfaceMod.Icons
import typingsJapgolly.rcSteps.libInterfaceMod.Status
import typingsJapgolly.rcSteps.libStepMod.StepProps
import typingsJapgolly.rcSteps.libStepsMod.ProgressDotRender
import typingsJapgolly.rcSteps.rcStepsStrings.default
import typingsJapgolly.rcSteps.rcStepsStrings.horizontal
import typingsJapgolly.rcSteps.rcStepsStrings.navigation
import typingsJapgolly.rcSteps.rcStepsStrings.small
import typingsJapgolly.rcSteps.rcStepsStrings.vertical
import typingsJapgolly.react.mod.CSSProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@scala.inline
open class SharedBuilder_StepsProps1971936139[R <: js.Object] (val args: js.Array[Any])
  extends AnyVal
     with StBuildingComponent[R] {
  
  inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
  
  inline def current(value: Double): this.type = set("current", value.asInstanceOf[js.Any])
  
  inline def direction(value: horizontal | vertical): this.type = set("direction", value.asInstanceOf[js.Any])
  
  inline def iconPrefix(value: String): this.type = set("iconPrefix", value.asInstanceOf[js.Any])
  
  inline def icons(value: Icons): this.type = set("icons", value.asInstanceOf[js.Any])
  
  inline def initial(value: Double): this.type = set("initial", value.asInstanceOf[js.Any])
  
  inline def items(value: js.Array[StepProps]): this.type = set("items", value.asInstanceOf[js.Any])
  
  inline def itemsVarargs(value: StepProps*): this.type = set("items", js.Array(value*))
  
  inline def labelPlacement(value: horizontal | vertical): this.type = set("labelPlacement", value.asInstanceOf[js.Any])
  
  inline def onChange(value: /* current */ Double => Callback): this.type = set("onChange", js.Any.fromFunction1((t0: /* current */ Double) => value(t0).runNow()))
  
  inline def prefixCls(value: String): this.type = set("prefixCls", value.asInstanceOf[js.Any])
  
  inline def progressDot(value: ProgressDotRender | Boolean): this.type = set("progressDot", value.asInstanceOf[js.Any])
  
  inline def progressDotFunction2(value: (/* iconDot */ Any, /* info */ Description) => Node): this.type = set("progressDot", js.Any.fromFunction2(value))
  
  inline def size(value: default | small): this.type = set("size", value.asInstanceOf[js.Any])
  
  inline def status(value: Status): this.type = set("status", value.asInstanceOf[js.Any])
  
  inline def stepIcon(value: /* info */ Index => Node): this.type = set("stepIcon", js.Any.fromFunction1(value))
  
  inline def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
  
  inline def `type`(value: default | navigation): this.type = set("type", value.asInstanceOf[js.Any])
}
