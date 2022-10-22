package typingsJapgolly.reactCountup.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.React.Node
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.react.mod.ComponentPropsWithoutRef
import typingsJapgolly.reactCountup.buildTypesMod.OnEndArgs
import typingsJapgolly.reactCountup.buildTypesMod.OnPauseResumeArgs
import typingsJapgolly.reactCountup.buildTypesMod.OnResetArgs
import typingsJapgolly.reactCountup.buildTypesMod.OnStartArgs
import typingsJapgolly.reactCountup.buildTypesMod.OnUpdateArgs
import typingsJapgolly.reactCountup.buildTypesMod.RenderCounterProps
import typingsJapgolly.reactCountup.reactCountupStrings.span
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@scala.inline
open class SharedBuilder_CountUpProps_1889893989 (val args: js.Array[Any])
  extends AnyVal
     with StBuildingComponent[scala.Nothing] {
  
  inline def children(value: /* props */ RenderCounterProps => Node): this.type = set("children", js.Any.fromFunction1(value))
  
  inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
  
  inline def containerProps(value: ComponentPropsWithoutRef[span]): this.type = set("containerProps", value.asInstanceOf[js.Any])
  
  inline def decimal(value: String): this.type = set("decimal", value.asInstanceOf[js.Any])
  
  inline def decimalPlaces(value: Double): this.type = set("decimalPlaces", value.asInstanceOf[js.Any])
  
  inline def decimals(value: Double): this.type = set("decimals", value.asInstanceOf[js.Any])
  
  inline def delay(value: Double): this.type = set("delay", value.asInstanceOf[js.Any])
  
  inline def delayNull: this.type = set("delay", null)
  
  inline def duration(value: Double): this.type = set("duration", value.asInstanceOf[js.Any])
  
  inline def easingFn(value: (/* t */ Double, /* b */ Double, /* c */ Double, /* d */ Double) => Double): this.type = set("easingFn", js.Any.fromFunction4(value))
  
  inline def enableScrollSpy(value: Boolean): this.type = set("enableScrollSpy", value.asInstanceOf[js.Any])
  
  inline def formattingFn(value: /* n */ Double => String): this.type = set("formattingFn", js.Any.fromFunction1(value))
  
  inline def numerals(value: js.Array[String]): this.type = set("numerals", value.asInstanceOf[js.Any])
  
  inline def numeralsVarargs(value: String*): this.type = set("numerals", js.Array(value*))
  
  inline def onEnd(value: /* args */ OnEndArgs => Callback): this.type = set("onEnd", js.Any.fromFunction1((t0: /* args */ OnEndArgs) => value(t0).runNow()))
  
  inline def onPauseResume(value: /* args */ OnPauseResumeArgs => Callback): this.type = set("onPauseResume", js.Any.fromFunction1((t0: /* args */ OnPauseResumeArgs) => value(t0).runNow()))
  
  inline def onReset(value: /* args */ OnResetArgs => Callback): this.type = set("onReset", js.Any.fromFunction1((t0: /* args */ OnResetArgs) => value(t0).runNow()))
  
  inline def onStart(value: /* args */ OnStartArgs => Callback): this.type = set("onStart", js.Any.fromFunction1((t0: /* args */ OnStartArgs) => value(t0).runNow()))
  
  inline def onUpdate(value: /* args */ OnUpdateArgs => Callback): this.type = set("onUpdate", js.Any.fromFunction1((t0: /* args */ OnUpdateArgs) => value(t0).runNow()))
  
  inline def prefix(value: String): this.type = set("prefix", value.asInstanceOf[js.Any])
  
  inline def preserveValue(value: Boolean): this.type = set("preserveValue", value.asInstanceOf[js.Any])
  
  inline def redraw(value: Boolean): this.type = set("redraw", value.asInstanceOf[js.Any])
  
  inline def scrollSpyDelay(value: Double): this.type = set("scrollSpyDelay", value.asInstanceOf[js.Any])
  
  inline def scrollSpyOnce(value: Boolean): this.type = set("scrollSpyOnce", value.asInstanceOf[js.Any])
  
  inline def separator(value: String): this.type = set("separator", value.asInstanceOf[js.Any])
  
  inline def smartEasingAmount(value: Double): this.type = set("smartEasingAmount", value.asInstanceOf[js.Any])
  
  inline def smartEasingThreshold(value: Double): this.type = set("smartEasingThreshold", value.asInstanceOf[js.Any])
  
  inline def start(value: Double): this.type = set("start", value.asInstanceOf[js.Any])
  
  inline def startVal(value: Double): this.type = set("startVal", value.asInstanceOf[js.Any])
  
  inline def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
  
  inline def suffix(value: String): this.type = set("suffix", value.asInstanceOf[js.Any])
  
  inline def useEasing(value: Boolean): this.type = set("useEasing", value.asInstanceOf[js.Any])
  
  inline def useGrouping(value: Boolean): this.type = set("useGrouping", value.asInstanceOf[js.Any])
}
