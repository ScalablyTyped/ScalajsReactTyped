package typingsJapgolly.victoryCursorContainer

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.React.Component
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.vdom.VdomElement
import org.scalablytyped.runtime.Instantiable1
import typingsJapgolly.victoryCursorContainer.anon.ComponentDidCatch
import typingsJapgolly.victoryCursorContainer.anon.DefaultEvents
import typingsJapgolly.victoryCursorContainer.anon.Instantiable
import typingsJapgolly.victoryCursorContainer.victoryCursorContainerStrings.x
import typingsJapgolly.victoryCursorContainer.victoryCursorContainerStrings.y
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esVictoryCursorContainerMod {
  
  @JSImport("victory-cursor-container/es/victory-cursor-container", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("victory-cursor-container/es/victory-cursor-container", "VictoryCursorContainer")
  @js.native
  val VictoryCursorContainer: Instantiable & (/* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof VictoryContainer */ Any) = js.native
  type VictoryCursorContainer = Instantiable & (/* import warning: importer.ImportType#apply Failed type conversion: typeof VictoryContainer */ js.Any)
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("victory-cursor-container/es/victory-cursor-container", "VictoryCursorContainer")
  @js.native
  open class VictoryCursorContainerCls protected ()
    extends StObject
       with ComponentDidCatch {
    def this(props: VictoryCursorContainerProps) = this()
  }
  
  inline def cursorContainerMixin[TBase /* <: ComponentClass[TProps] */, TProps /* <: VictoryCursorContainerProps */](Base: TBase): DefaultEvents[TProps] & TBase = ^.asInstanceOf[js.Dynamic].applyDynamic("cursorContainerMixin")(Base.asInstanceOf[js.Any]).asInstanceOf[DefaultEvents[TProps] & TBase]
  
  @js.native
  trait ComponentClass[TProps]
    extends StObject
       with Instantiable1[/* props */ TProps, Component[TProps & js.Object, js.Object]]
  
  type CursorCoordinatesPropType = (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CoordinatesPropType */ Any) | Double
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify VictoryContainerProps * / any */ trait VictoryCursorContainerProps extends StObject {
    
    var cursorComponent: js.UndefOr[Element] = js.undefined
    
    var cursorDimension: js.UndefOr[x | y] = js.undefined
    
    var cursorLabel: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ValueOrAccessor<VictoryLabelProps['text']> */ Any
      ] = js.undefined
    
    var cursorLabelComponent: js.UndefOr[Element] = js.undefined
    
    var cursorLabelOffset: js.UndefOr[CursorCoordinatesPropType] = js.undefined
    
    var defaultCursorValue: js.UndefOr[CursorCoordinatesPropType] = js.undefined
    
    var disable: js.UndefOr[Boolean] = js.undefined
    
    var onCursorChange: js.UndefOr[js.Function2[/* value */ CursorCoordinatesPropType, /* props */ this.type, Unit]] = js.undefined
  }
  object VictoryCursorContainerProps {
    
    inline def apply(): VictoryCursorContainerProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[VictoryCursorContainerProps]
    }
    
    extension [Self <: VictoryCursorContainerProps](x: Self) {
      
      inline def setCursorComponent(value: VdomElement): Self = StObject.set(x, "cursorComponent", value.rawElement.asInstanceOf[js.Any])
      
      inline def setCursorComponentUndefined: Self = StObject.set(x, "cursorComponent", js.undefined)
      
      inline def setCursorDimension(value: typingsJapgolly.victoryCursorContainer.victoryCursorContainerStrings.x | y): Self = StObject.set(x, "cursorDimension", value.asInstanceOf[js.Any])
      
      inline def setCursorDimensionUndefined: Self = StObject.set(x, "cursorDimension", js.undefined)
      
      inline def setCursorLabel(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ValueOrAccessor<VictoryLabelProps['text']> */ Any
      ): Self = StObject.set(x, "cursorLabel", value.asInstanceOf[js.Any])
      
      inline def setCursorLabelComponent(value: VdomElement): Self = StObject.set(x, "cursorLabelComponent", value.rawElement.asInstanceOf[js.Any])
      
      inline def setCursorLabelComponentUndefined: Self = StObject.set(x, "cursorLabelComponent", js.undefined)
      
      inline def setCursorLabelOffset(value: CursorCoordinatesPropType): Self = StObject.set(x, "cursorLabelOffset", value.asInstanceOf[js.Any])
      
      inline def setCursorLabelOffsetUndefined: Self = StObject.set(x, "cursorLabelOffset", js.undefined)
      
      inline def setCursorLabelUndefined: Self = StObject.set(x, "cursorLabel", js.undefined)
      
      inline def setDefaultCursorValue(value: CursorCoordinatesPropType): Self = StObject.set(x, "defaultCursorValue", value.asInstanceOf[js.Any])
      
      inline def setDefaultCursorValueUndefined: Self = StObject.set(x, "defaultCursorValue", js.undefined)
      
      inline def setDisable(value: Boolean): Self = StObject.set(x, "disable", value.asInstanceOf[js.Any])
      
      inline def setDisableUndefined: Self = StObject.set(x, "disable", js.undefined)
      
      inline def setOnCursorChange(value: (/* value */ CursorCoordinatesPropType, VictoryCursorContainerProps) => Callback): Self = StObject.set(x, "onCursorChange", js.Any.fromFunction2((t0: /* value */ CursorCoordinatesPropType, t1: VictoryCursorContainerProps) => (value(t0, t1)).runNow()))
      
      inline def setOnCursorChangeUndefined: Self = StObject.set(x, "onCursorChange", js.undefined)
    }
  }
}
