package typingsJapgolly.victoryBrushContainer

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.React.Component
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.vdom.VdomElement
import org.scalablytyped.runtime.Instantiable1
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.victoryBrushContainer.anon.ComponentDidCatch
import typingsJapgolly.victoryBrushContainer.anon.Instantiable
import typingsJapgolly.victoryBrushContainer.anon.XAny
import typingsJapgolly.victoryBrushContainer.anon.`0`
import typingsJapgolly.victoryBrushContainer.victoryBrushContainerStrings.all
import typingsJapgolly.victoryBrushContainer.victoryBrushContainerStrings.disable
import typingsJapgolly.victoryBrushContainer.victoryBrushContainerStrings.move
import typingsJapgolly.victoryBrushContainer.victoryBrushContainerStrings.none
import typingsJapgolly.victoryBrushContainer.victoryBrushContainerStrings.x
import typingsJapgolly.victoryBrushContainer.victoryBrushContainerStrings.y
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esVictoryBrushContainerMod {
  
  @JSImport("victory-brush-container/es/victory-brush-container", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("victory-brush-container/es/victory-brush-container", "VictoryBrushContainer")
  @js.native
  val VictoryBrushContainer: Instantiable & (/* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof VictoryContainer */ Any) = js.native
  type VictoryBrushContainer = Instantiable & (/* import warning: importer.ImportType#apply Failed type conversion: typeof VictoryContainer */ js.Any)
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("victory-brush-container/es/victory-brush-container", "VictoryBrushContainer")
  @js.native
  open class VictoryBrushContainerCls protected ()
    extends StObject
       with ComponentDidCatch {
    def this(args: Any*) = this()
  }
  
  inline def brushContainerMixin[TBase /* <: Constructor */](base: TBase): Instantiable & TBase = ^.asInstanceOf[js.Dynamic].applyDynamic("brushContainerMixin")(base.asInstanceOf[js.Any]).asInstanceOf[Instantiable & TBase]
  
  type Constructor = Instantiable1[/* args (repeated) */ Any, Component[js.Object, js.Object]]
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify VictoryContainerProps * / any */ trait VictoryBrushContainerProps extends StObject {
    
    var allowDrag: js.UndefOr[Boolean] = js.undefined
    
    var allowDraw: js.UndefOr[Boolean] = js.undefined
    
    var allowResize: js.UndefOr[Boolean] = js.undefined
    
    var brushComponent: js.UndefOr[Element] = js.undefined
    
    var brushDimension: js.UndefOr[x | y] = js.undefined
    
    var brushDomain: js.UndefOr[`0`] = js.undefined
    
    var brushStyle: js.UndefOr[CSSProperties] = js.undefined
    
    var defaultBrushArea: js.UndefOr[all | none | disable | move] = js.undefined
    
    var disable: js.UndefOr[Boolean] = js.undefined
    
    var handleComponent: js.UndefOr[Element] = js.undefined
    
    var handleStyle: js.UndefOr[CSSProperties] = js.undefined
    
    var handleWidth: js.UndefOr[Double] = js.undefined
    
    var onBrushCleared: js.UndefOr[js.Function2[/* domain */ XAny, /* props */ this.type, Unit]] = js.undefined
    
    var onBrushDomainChange: js.UndefOr[js.Function2[/* domain */ XAny, /* props */ this.type, Unit]] = js.undefined
    
    var onBrushDomainChangeEnd: js.UndefOr[js.Function2[/* domain */ XAny, /* props */ this.type, Unit]] = js.undefined
  }
  object VictoryBrushContainerProps {
    
    inline def apply(): VictoryBrushContainerProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[VictoryBrushContainerProps]
    }
    
    extension [Self <: VictoryBrushContainerProps](x: Self) {
      
      inline def setAllowDrag(value: Boolean): Self = StObject.set(x, "allowDrag", value.asInstanceOf[js.Any])
      
      inline def setAllowDragUndefined: Self = StObject.set(x, "allowDrag", js.undefined)
      
      inline def setAllowDraw(value: Boolean): Self = StObject.set(x, "allowDraw", value.asInstanceOf[js.Any])
      
      inline def setAllowDrawUndefined: Self = StObject.set(x, "allowDraw", js.undefined)
      
      inline def setAllowResize(value: Boolean): Self = StObject.set(x, "allowResize", value.asInstanceOf[js.Any])
      
      inline def setAllowResizeUndefined: Self = StObject.set(x, "allowResize", js.undefined)
      
      inline def setBrushComponent(value: VdomElement): Self = StObject.set(x, "brushComponent", value.rawElement.asInstanceOf[js.Any])
      
      inline def setBrushComponentUndefined: Self = StObject.set(x, "brushComponent", js.undefined)
      
      inline def setBrushDimension(value: typingsJapgolly.victoryBrushContainer.victoryBrushContainerStrings.x | y): Self = StObject.set(x, "brushDimension", value.asInstanceOf[js.Any])
      
      inline def setBrushDimensionUndefined: Self = StObject.set(x, "brushDimension", js.undefined)
      
      inline def setBrushDomain(value: `0`): Self = StObject.set(x, "brushDomain", value.asInstanceOf[js.Any])
      
      inline def setBrushDomainUndefined: Self = StObject.set(x, "brushDomain", js.undefined)
      
      inline def setBrushStyle(value: CSSProperties): Self = StObject.set(x, "brushStyle", value.asInstanceOf[js.Any])
      
      inline def setBrushStyleUndefined: Self = StObject.set(x, "brushStyle", js.undefined)
      
      inline def setDefaultBrushArea(value: all | none | disable | move): Self = StObject.set(x, "defaultBrushArea", value.asInstanceOf[js.Any])
      
      inline def setDefaultBrushAreaUndefined: Self = StObject.set(x, "defaultBrushArea", js.undefined)
      
      inline def setDisable(value: Boolean): Self = StObject.set(x, "disable", value.asInstanceOf[js.Any])
      
      inline def setDisableUndefined: Self = StObject.set(x, "disable", js.undefined)
      
      inline def setHandleComponent(value: VdomElement): Self = StObject.set(x, "handleComponent", value.rawElement.asInstanceOf[js.Any])
      
      inline def setHandleComponentUndefined: Self = StObject.set(x, "handleComponent", js.undefined)
      
      inline def setHandleStyle(value: CSSProperties): Self = StObject.set(x, "handleStyle", value.asInstanceOf[js.Any])
      
      inline def setHandleStyleUndefined: Self = StObject.set(x, "handleStyle", js.undefined)
      
      inline def setHandleWidth(value: Double): Self = StObject.set(x, "handleWidth", value.asInstanceOf[js.Any])
      
      inline def setHandleWidthUndefined: Self = StObject.set(x, "handleWidth", js.undefined)
      
      inline def setOnBrushCleared(value: (/* domain */ XAny, VictoryBrushContainerProps) => Callback): Self = StObject.set(x, "onBrushCleared", js.Any.fromFunction2((t0: /* domain */ XAny, t1: VictoryBrushContainerProps) => (value(t0, t1)).runNow()))
      
      inline def setOnBrushClearedUndefined: Self = StObject.set(x, "onBrushCleared", js.undefined)
      
      inline def setOnBrushDomainChange(value: (/* domain */ XAny, VictoryBrushContainerProps) => Callback): Self = StObject.set(x, "onBrushDomainChange", js.Any.fromFunction2((t0: /* domain */ XAny, t1: VictoryBrushContainerProps) => (value(t0, t1)).runNow()))
      
      inline def setOnBrushDomainChangeEnd(value: (/* domain */ XAny, VictoryBrushContainerProps) => Callback): Self = StObject.set(x, "onBrushDomainChangeEnd", js.Any.fromFunction2((t0: /* domain */ XAny, t1: VictoryBrushContainerProps) => (value(t0, t1)).runNow()))
      
      inline def setOnBrushDomainChangeEndUndefined: Self = StObject.set(x, "onBrushDomainChangeEnd", js.undefined)
      
      inline def setOnBrushDomainChangeUndefined: Self = StObject.set(x, "onBrushDomainChange", js.undefined)
    }
  }
}
