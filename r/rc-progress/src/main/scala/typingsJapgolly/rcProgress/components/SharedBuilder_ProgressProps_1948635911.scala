package typingsJapgolly.rcProgress.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactMouseEventFrom
import org.scalajs.dom.Element
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.rcProgress.anon.Count
import typingsJapgolly.rcProgress.esInterfaceMod.BaseStrokeColorType
import typingsJapgolly.rcProgress.esInterfaceMod.GapPositionType
import typingsJapgolly.rcProgress.esInterfaceMod.StrokeColorType
import typingsJapgolly.rcProgress.esInterfaceMod.StrokeLinecapType
import typingsJapgolly.react.mod.CSSProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@scala.inline
open class SharedBuilder_ProgressProps_1948635911 (val args: js.Array[Any])
  extends AnyVal
     with StBuildingComponent[scala.Nothing] {
  
  inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
  
  inline def gapDegree(value: Double): this.type = set("gapDegree", value.asInstanceOf[js.Any])
  
  inline def gapPosition(value: GapPositionType): this.type = set("gapPosition", value.asInstanceOf[js.Any])
  
  inline def id(value: String): this.type = set("id", value.asInstanceOf[js.Any])
  
  inline def onClick(value: ReactMouseEventFrom[Element & Element] => Callback): this.type = set("onClick", js.Any.fromFunction1((t0: ReactMouseEventFrom[Element & Element]) => value(t0).runNow()))
  
  inline def percent(value: Double | js.Array[Double]): this.type = set("percent", value.asInstanceOf[js.Any])
  
  inline def percentVarargs(value: Double*): this.type = set("percent", js.Array(value*))
  
  inline def prefixCls(value: String): this.type = set("prefixCls", value.asInstanceOf[js.Any])
  
  inline def steps(value: Double | Count): this.type = set("steps", value.asInstanceOf[js.Any])
  
  inline def strokeColor(value: StrokeColorType): this.type = set("strokeColor", value.asInstanceOf[js.Any])
  
  inline def strokeColorVarargs(value: BaseStrokeColorType*): this.type = set("strokeColor", js.Array(value*))
  
  inline def strokeLinecap(value: StrokeLinecapType): this.type = set("strokeLinecap", value.asInstanceOf[js.Any])
  
  inline def strokeWidth(value: Double): this.type = set("strokeWidth", value.asInstanceOf[js.Any])
  
  inline def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
  
  inline def trailColor(value: String): this.type = set("trailColor", value.asInstanceOf[js.Any])
  
  inline def trailWidth(value: Double): this.type = set("trailWidth", value.asInstanceOf[js.Any])
  
  inline def transition(value: String): this.type = set("transition", value.asInstanceOf[js.Any])
}
