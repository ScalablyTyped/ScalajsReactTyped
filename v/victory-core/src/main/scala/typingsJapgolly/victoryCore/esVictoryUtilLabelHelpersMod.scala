package typingsJapgolly.victoryCore

import typingsJapgolly.victoryCore.anon.Angle
import typingsJapgolly.victoryCore.victoryCoreStrings.end
import typingsJapgolly.victoryCore.victoryCoreStrings.middle
import typingsJapgolly.victoryCore.victoryCoreStrings.start
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esVictoryUtilLabelHelpersMod {
  
  @JSImport("victory-core/es/victory-util/label-helpers", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getDegrees(props: Any, datum: Any): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getDegrees")(props.asInstanceOf[js.Any], datum.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def getPolarAngle(props: Any): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getPolarAngle")(props.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def getPolarAngle(props: Any, baseAngle: Any): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getPolarAngle")(props.asInstanceOf[js.Any], baseAngle.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def getPolarTextAnchor(props: Any, degrees: Any): end | start | middle = (^.asInstanceOf[js.Dynamic].applyDynamic("getPolarTextAnchor")(props.asInstanceOf[js.Any], degrees.asInstanceOf[js.Any])).asInstanceOf[end | start | middle]
  
  inline def getPolarVerticalAnchor(props: Any, degrees: Any): end | start | middle = (^.asInstanceOf[js.Dynamic].applyDynamic("getPolarVerticalAnchor")(props.asInstanceOf[js.Any], degrees.asInstanceOf[js.Any])).asInstanceOf[end | start | middle]
  
  inline def getProps(props: Any, index: Any): Angle = (^.asInstanceOf[js.Dynamic].applyDynamic("getProps")(props.asInstanceOf[js.Any], index.asInstanceOf[js.Any])).asInstanceOf[Angle]
  
  inline def getText(props: Any, datum: Any, index: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getText")(props.asInstanceOf[js.Any], datum.asInstanceOf[js.Any], index.asInstanceOf[js.Any])).asInstanceOf[Any]
}
