package typingsJapgolly.victorySelectionContainer

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.vdom.VdomElement
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.react.mod.Component
import typingsJapgolly.victorySelectionContainer.anon.X
import typingsJapgolly.victorySelectionContainer.victorySelectionContainerStrings.x
import typingsJapgolly.victorySelectionContainer.victorySelectionContainerStrings.y
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esMod {
  
  @JSImport("victory-selection-container/es", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  object SelectionHelpers {
    
    @JSImport("victory-selection-container/es", "SelectionHelpers")
    @js.native
    val ^ : js.Any = js.native
    
    inline def filterDatasets(props: Any, datasets: Any, bounds: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("filterDatasets")(props.asInstanceOf[js.Any], datasets.asInstanceOf[js.Any], bounds.asInstanceOf[js.Any])).asInstanceOf[Any]
    
    inline def getDatasets(props: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getDatasets")(props.asInstanceOf[js.Any]).asInstanceOf[Any]
    
    inline def getDimension(props: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getDimension")(props.asInstanceOf[js.Any]).asInstanceOf[Any]
    
    inline def getSelectedData(props: Any, dataset: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getSelectedData")(props.asInstanceOf[js.Any], dataset.asInstanceOf[js.Any])).asInstanceOf[Any]
    
    inline def onMouseDown(evt: Any, targetProps: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("onMouseDown")(evt.asInstanceOf[js.Any], targetProps.asInstanceOf[js.Any])).asInstanceOf[Any]
    
    inline def onMouseMove(evt: Any, targetProps: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("onMouseMove")(evt.asInstanceOf[js.Any], targetProps.asInstanceOf[js.Any])).asInstanceOf[Any]
    
    inline def onMouseUp(evt: Any, targetProps: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("onMouseUp")(evt.asInstanceOf[js.Any], targetProps.asInstanceOf[js.Any])).asInstanceOf[Any]
  }
  
  @JSImport("victory-selection-container/es", "VictorySelectionContainer")
  @js.native
  open class VictorySelectionContainer protected () extends Component[VictorySelectionContainerProps, Any, Any] {
    def this(props: VictorySelectionContainerProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: VictorySelectionContainerProps, context: Any) = this()
  }
  
  inline def selectionContainerMixin(base: js.Function): js.Function = ^.asInstanceOf[js.Dynamic].applyDynamic("selectionContainerMixin")(base.asInstanceOf[js.Any]).asInstanceOf[js.Function]
  
  trait PointsInterface extends StObject {
    
    var childName: js.UndefOr[String | js.Array[String]] = js.undefined
    
    var data: js.UndefOr[Any] = js.undefined
    
    var eventKey: js.UndefOr[String | Double] = js.undefined
  }
  object PointsInterface {
    
    inline def apply(): PointsInterface = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PointsInterface]
    }
    
    extension [Self <: PointsInterface](x: Self) {
      
      inline def setChildName(value: String | js.Array[String]): Self = StObject.set(x, "childName", value.asInstanceOf[js.Any])
      
      inline def setChildNameUndefined: Self = StObject.set(x, "childName", js.undefined)
      
      inline def setChildNameVarargs(value: String*): Self = StObject.set(x, "childName", js.Array(value*))
      
      inline def setData(value: Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      inline def setEventKey(value: String | Double): Self = StObject.set(x, "eventKey", value.asInstanceOf[js.Any])
      
      inline def setEventKeyUndefined: Self = StObject.set(x, "eventKey", js.undefined)
    }
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify VictoryContainerProps * / any */ trait VictorySelectionContainerProps extends StObject {
    
    var activateSelectedData: js.UndefOr[Boolean] = js.undefined
    
    var allowSelection: js.UndefOr[Boolean] = js.undefined
    
    var disable: js.UndefOr[Boolean] = js.undefined
    
    var onSelection: js.UndefOr[
        js.Function3[
          /* points */ js.Array[PointsInterface], 
          /* bounds */ js.Array[X], 
          /* props */ this.type, 
          Unit
        ]
      ] = js.undefined
    
    var onSelectionCleared: js.UndefOr[js.Function1[/* props */ this.type, Unit]] = js.undefined
    
    var selectionBlacklist: js.UndefOr[js.Array[String]] = js.undefined
    
    var selectionComponent: js.UndefOr[Element] = js.undefined
    
    var selectionDimension: js.UndefOr[x | y] = js.undefined
    
    var selectionStyle: js.UndefOr[CSSProperties] = js.undefined
  }
  object VictorySelectionContainerProps {
    
    inline def apply(): VictorySelectionContainerProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[VictorySelectionContainerProps]
    }
    
    extension [Self <: VictorySelectionContainerProps](x: Self) {
      
      inline def setActivateSelectedData(value: Boolean): Self = StObject.set(x, "activateSelectedData", value.asInstanceOf[js.Any])
      
      inline def setActivateSelectedDataUndefined: Self = StObject.set(x, "activateSelectedData", js.undefined)
      
      inline def setAllowSelection(value: Boolean): Self = StObject.set(x, "allowSelection", value.asInstanceOf[js.Any])
      
      inline def setAllowSelectionUndefined: Self = StObject.set(x, "allowSelection", js.undefined)
      
      inline def setDisable(value: Boolean): Self = StObject.set(x, "disable", value.asInstanceOf[js.Any])
      
      inline def setDisableUndefined: Self = StObject.set(x, "disable", js.undefined)
      
      inline def setOnSelection(
        value: (/* points */ js.Array[PointsInterface], /* bounds */ js.Array[X], VictorySelectionContainerProps) => Callback
      ): Self = StObject.set(x, "onSelection", js.Any.fromFunction3((t0: /* points */ js.Array[PointsInterface], t1: /* bounds */ js.Array[X], t2: VictorySelectionContainerProps) => (value(t0, t1, t2)).runNow()))
      
      inline def setOnSelectionCleared(value: VictorySelectionContainerProps => Callback): Self = StObject.set(x, "onSelectionCleared", js.Any.fromFunction1((t0: VictorySelectionContainerProps) => value(t0).runNow()))
      
      inline def setOnSelectionClearedUndefined: Self = StObject.set(x, "onSelectionCleared", js.undefined)
      
      inline def setOnSelectionUndefined: Self = StObject.set(x, "onSelection", js.undefined)
      
      inline def setSelectionBlacklist(value: js.Array[String]): Self = StObject.set(x, "selectionBlacklist", value.asInstanceOf[js.Any])
      
      inline def setSelectionBlacklistUndefined: Self = StObject.set(x, "selectionBlacklist", js.undefined)
      
      inline def setSelectionBlacklistVarargs(value: String*): Self = StObject.set(x, "selectionBlacklist", js.Array(value*))
      
      inline def setSelectionComponent(value: VdomElement): Self = StObject.set(x, "selectionComponent", value.rawElement.asInstanceOf[js.Any])
      
      inline def setSelectionComponentUndefined: Self = StObject.set(x, "selectionComponent", js.undefined)
      
      inline def setSelectionDimension(value: typingsJapgolly.victorySelectionContainer.victorySelectionContainerStrings.x | y): Self = StObject.set(x, "selectionDimension", value.asInstanceOf[js.Any])
      
      inline def setSelectionDimensionUndefined: Self = StObject.set(x, "selectionDimension", js.undefined)
      
      inline def setSelectionStyle(value: CSSProperties): Self = StObject.set(x, "selectionStyle", value.asInstanceOf[js.Any])
      
      inline def setSelectionStyleUndefined: Self = StObject.set(x, "selectionStyle", js.undefined)
    }
  }
}
