package typingsJapgolly.victoryLegend

import typingsJapgolly.victoryLegend.esMod.VictoryLegendOrientationType
import typingsJapgolly.victoryLegend.esMod.VictoryLegendTTargetType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object victoryLegendStrings {
  
  @js.native
  sealed trait data
    extends StObject
       with VictoryLegendTTargetType
  inline def data: data = "data".asInstanceOf[data]
  
  @js.native
  sealed trait horizontal
    extends StObject
       with VictoryLegendOrientationType
  inline def horizontal: horizontal = "horizontal".asInstanceOf[horizontal]
  
  @js.native
  sealed trait labels
    extends StObject
       with VictoryLegendTTargetType
  inline def labels: labels = "labels".asInstanceOf[labels]
  
  @js.native
  sealed trait left extends StObject
  inline def left: left = "left".asInstanceOf[left]
  
  @js.native
  sealed trait parent
    extends StObject
       with VictoryLegendTTargetType
  inline def parent: parent = "parent".asInstanceOf[parent]
  
  @js.native
  sealed trait right extends StObject
  inline def right: right = "right".asInstanceOf[right]
  
  @js.native
  sealed trait vertical
    extends StObject
       with VictoryLegendOrientationType
  inline def vertical: vertical = "vertical".asInstanceOf[vertical]
}
