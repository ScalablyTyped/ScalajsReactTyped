package typingsJapgolly.rcMotion.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.React.Element
import org.scalajs.dom.HTMLElement
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.rcMotion.anon.Dictkey
import typingsJapgolly.rcMotion.esCssmotionMod.MotionName
import typingsJapgolly.rcMotion.esInterfaceMod.MotionEvent
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.react.mod.Ref
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@scala.inline
open class SharedBuilder_CSSMotionPropsrefRefanyun1121577939 (val args: js.Array[Any])
  extends AnyVal
     with StBuildingComponent[scala.Nothing] {
  
  inline def children(value: (/* props */ Dictkey, /* ref */ js.Function1[/* node */ Any, Unit]) => Element): this.type = set("children", js.Any.fromFunction2(value))
  
  inline def eventProps(value: js.Object): this.type = set("eventProps", value.asInstanceOf[js.Any])
  
  inline def forceRender(value: Boolean): this.type = set("forceRender", value.asInstanceOf[js.Any])
  
  inline def internalRef(value: Ref[Any]): this.type = set("internalRef", value.asInstanceOf[js.Any])
  
  inline def internalRefFunction1(value: Any | Null => Callback): this.type = set("internalRef", js.Any.fromFunction1((t0: Any | Null) => value(t0).runNow()))
  
  inline def internalRefNull: this.type = set("internalRef", null)
  
  inline def leavedClassName(value: String): this.type = set("leavedClassName", value.asInstanceOf[js.Any])
  
  inline def motionAppear(value: Boolean): this.type = set("motionAppear", value.asInstanceOf[js.Any])
  
  inline def motionDeadline(value: Double): this.type = set("motionDeadline", value.asInstanceOf[js.Any])
  
  inline def motionEnter(value: Boolean): this.type = set("motionEnter", value.asInstanceOf[js.Any])
  
  inline def motionLeave(value: Boolean): this.type = set("motionLeave", value.asInstanceOf[js.Any])
  
  inline def motionLeaveImmediately(value: Boolean): this.type = set("motionLeaveImmediately", value.asInstanceOf[js.Any])
  
  inline def motionName(value: MotionName): this.type = set("motionName", value.asInstanceOf[js.Any])
  
  inline def onAppearActive(value: (/* element */ HTMLElement, /* event */ MotionEvent) => CSSProperties | Unit): this.type = set("onAppearActive", js.Any.fromFunction2(value))
  
  inline def onAppearEnd(value: (/* element */ HTMLElement, /* event */ MotionEvent) => Boolean | Unit): this.type = set("onAppearEnd", js.Any.fromFunction2(value))
  
  inline def onAppearPrepare(value: /* element */ HTMLElement => js.Promise[Any] | Unit): this.type = set("onAppearPrepare", js.Any.fromFunction1(value))
  
  inline def onAppearStart(value: (/* element */ HTMLElement, /* event */ MotionEvent) => CSSProperties | Unit): this.type = set("onAppearStart", js.Any.fromFunction2(value))
  
  inline def onEnterActive(value: (/* element */ HTMLElement, /* event */ MotionEvent) => CSSProperties | Unit): this.type = set("onEnterActive", js.Any.fromFunction2(value))
  
  inline def onEnterEnd(value: (/* element */ HTMLElement, /* event */ MotionEvent) => Boolean | Unit): this.type = set("onEnterEnd", js.Any.fromFunction2(value))
  
  inline def onEnterPrepare(value: /* element */ HTMLElement => js.Promise[Any] | Unit): this.type = set("onEnterPrepare", js.Any.fromFunction1(value))
  
  inline def onEnterStart(value: (/* element */ HTMLElement, /* event */ MotionEvent) => CSSProperties | Unit): this.type = set("onEnterStart", js.Any.fromFunction2(value))
  
  inline def onLeaveActive(value: (/* element */ HTMLElement, /* event */ MotionEvent) => CSSProperties | Unit): this.type = set("onLeaveActive", js.Any.fromFunction2(value))
  
  inline def onLeaveEnd(value: (/* element */ HTMLElement, /* event */ MotionEvent) => Boolean | Unit): this.type = set("onLeaveEnd", js.Any.fromFunction2(value))
  
  inline def onLeavePrepare(value: /* element */ HTMLElement => js.Promise[Any] | Unit): this.type = set("onLeavePrepare", js.Any.fromFunction1(value))
  
  inline def onLeaveStart(value: (/* element */ HTMLElement, /* event */ MotionEvent) => CSSProperties | Unit): this.type = set("onLeaveStart", js.Any.fromFunction2(value))
  
  inline def onVisibleChanged(value: /* visible */ Boolean => Callback): this.type = set("onVisibleChanged", js.Any.fromFunction1((t0: /* visible */ Boolean) => value(t0).runNow()))
  
  inline def removeOnLeave(value: Boolean): this.type = set("removeOnLeave", value.asInstanceOf[js.Any])
  
  inline def visible(value: Boolean): this.type = set("visible", value.asInstanceOf[js.Any])
}
