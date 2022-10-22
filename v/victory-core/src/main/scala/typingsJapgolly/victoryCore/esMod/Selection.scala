package typingsJapgolly.victoryCore.esMod

import japgolly.scalajs.react.ReactEventFrom
import org.scalajs.dom.Element
import org.scalajs.dom.SVGElement
import typingsJapgolly.victoryCore.anon.PickSyntheticEventElement
import typingsJapgolly.victoryCore.anon.PickVictoryCommonPropssca
import typingsJapgolly.victoryCore.anon.XArray
import typingsJapgolly.victoryCore.esTypesPropTypesMod.DomainPropType
import typingsJapgolly.victoryCore.esTypesPropTypesMod.ScaleXYPropType
import typingsJapgolly.victoryCore.esVictoryUtilSelectionMod.ComputedCommonProps
import typingsJapgolly.victoryCore.esVictoryUtilSelectionMod.SVGCoordinateBounds
import typingsJapgolly.victoryCore.esVictoryUtilSelectionMod.SVGCoordinateType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Selection {
  
  @JSImport("victory-core/es", "Selection")
  @js.native
  val ^ : js.Any = js.native
  
  inline def getBounds(props: ComputedCommonProps): SVGCoordinateBounds = ^.asInstanceOf[js.Dynamic].applyDynamic("getBounds")(props.asInstanceOf[js.Any]).asInstanceOf[SVGCoordinateBounds]
  
  inline def getDataCoordinates(props: Any, scale: ScaleXYPropType, x: Double, y: Double): SVGCoordinateType = (^.asInstanceOf[js.Dynamic].applyDynamic("getDataCoordinates")(props.asInstanceOf[js.Any], scale.asInstanceOf[js.Any], x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[SVGCoordinateType]
  
  inline def getDomainCoordinates(props: PickVictoryCommonPropssca): XArray = ^.asInstanceOf[js.Dynamic].applyDynamic("getDomainCoordinates")(props.asInstanceOf[js.Any]).asInstanceOf[XArray]
  inline def getDomainCoordinates(props: PickVictoryCommonPropssca, domain: DomainPropType): XArray = (^.asInstanceOf[js.Dynamic].applyDynamic("getDomainCoordinates")(props.asInstanceOf[js.Any], domain.asInstanceOf[js.Any])).asInstanceOf[XArray]
  
  inline def getParentSVG(evt: PickSyntheticEventElement): SVGElement = ^.asInstanceOf[js.Dynamic].applyDynamic("getParentSVG")(evt.asInstanceOf[js.Any]).asInstanceOf[SVGElement]
  
  inline def getSVGEventCoordinates(evt: ReactEventFrom[Element]): SVGCoordinateType = ^.asInstanceOf[js.Dynamic].applyDynamic("getSVGEventCoordinates")(evt.asInstanceOf[js.Any]).asInstanceOf[SVGCoordinateType]
  inline def getSVGEventCoordinates(evt: ReactEventFrom[Element], svg: SVGElement): SVGCoordinateType = (^.asInstanceOf[js.Dynamic].applyDynamic("getSVGEventCoordinates")(evt.asInstanceOf[js.Any], svg.asInstanceOf[js.Any])).asInstanceOf[SVGCoordinateType]
}
