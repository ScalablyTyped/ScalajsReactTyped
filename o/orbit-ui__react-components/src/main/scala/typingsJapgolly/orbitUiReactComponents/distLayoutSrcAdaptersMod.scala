package typingsJapgolly.orbitUiReactComponents

import typingsJapgolly.orbitUiReactComponents.anon.AlignItems
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLayoutSrcAdaptersMod {
  
  @JSImport("@orbit-ui/react-components/dist/layout/src/adapters", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def useFlexAlignment(orientation: Orientation, align: Alignment, verticalAlign: Alignment): AlignItems = (^.asInstanceOf[js.Dynamic].applyDynamic("useFlexAlignment")(orientation.asInstanceOf[js.Any], align.asInstanceOf[js.Any], verticalAlign.asInstanceOf[js.Any])).asInstanceOf[AlignItems]
  
  inline def useFlexDirection(orientation: Orientation): typingsJapgolly.orbitUiReactComponents.anon.Direction = ^.asInstanceOf[js.Dynamic].applyDynamic("useFlexDirection")(orientation.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.orbitUiReactComponents.anon.Direction]
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.orbitUiReactComponents.orbitUiReactComponentsStrings.start
    - typingsJapgolly.orbitUiReactComponents.orbitUiReactComponentsStrings.end
    - typingsJapgolly.orbitUiReactComponents.orbitUiReactComponentsStrings.center
  */
  trait Alignment extends StObject
  object Alignment {
    
    inline def center: typingsJapgolly.orbitUiReactComponents.orbitUiReactComponentsStrings.center = "center".asInstanceOf[typingsJapgolly.orbitUiReactComponents.orbitUiReactComponentsStrings.center]
    
    inline def end: typingsJapgolly.orbitUiReactComponents.orbitUiReactComponentsStrings.end = "end".asInstanceOf[typingsJapgolly.orbitUiReactComponents.orbitUiReactComponentsStrings.end]
    
    inline def start: typingsJapgolly.orbitUiReactComponents.orbitUiReactComponentsStrings.start = "start".asInstanceOf[typingsJapgolly.orbitUiReactComponents.orbitUiReactComponentsStrings.start]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.orbitUiReactComponents.orbitUiReactComponentsStrings.row
    - typingsJapgolly.orbitUiReactComponents.orbitUiReactComponentsStrings.column
  */
  trait Direction extends StObject
  object Direction {
    
    inline def column: typingsJapgolly.orbitUiReactComponents.orbitUiReactComponentsStrings.column = "column".asInstanceOf[typingsJapgolly.orbitUiReactComponents.orbitUiReactComponentsStrings.column]
    
    inline def row: typingsJapgolly.orbitUiReactComponents.orbitUiReactComponentsStrings.row = "row".asInstanceOf[typingsJapgolly.orbitUiReactComponents.orbitUiReactComponentsStrings.row]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.orbitUiReactComponents.orbitUiReactComponentsStrings.horizontal
    - typingsJapgolly.orbitUiReactComponents.orbitUiReactComponentsStrings.vertical
  */
  trait Orientation extends StObject
  object Orientation {
    
    inline def horizontal: typingsJapgolly.orbitUiReactComponents.orbitUiReactComponentsStrings.horizontal = "horizontal".asInstanceOf[typingsJapgolly.orbitUiReactComponents.orbitUiReactComponentsStrings.horizontal]
    
    inline def vertical: typingsJapgolly.orbitUiReactComponents.orbitUiReactComponentsStrings.vertical = "vertical".asInstanceOf[typingsJapgolly.orbitUiReactComponents.orbitUiReactComponentsStrings.vertical]
  }
}
