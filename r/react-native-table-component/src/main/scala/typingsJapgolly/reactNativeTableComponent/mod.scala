package typingsJapgolly.reactNativeTableComponent

import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.react.mod.Component
import typingsJapgolly.reactNative.mod.StyleProp
import typingsJapgolly.reactNative.mod.TextStyle
import typingsJapgolly.reactNative.mod.ViewStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-native-table-component", "Cell")
  @js.native
  open class Cell protected ()
    extends Component[CellProps, js.Object, Any] {
    def this(props: CellProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: CellProps, context: Any) = this()
  }
  
  @JSImport("react-native-table-component", "Col")
  @js.native
  open class Col protected ()
    extends Component[ColProps, js.Object, Any] {
    def this(props: ColProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: ColProps, context: Any) = this()
  }
  
  @JSImport("react-native-table-component", "Cols")
  @js.native
  open class Cols protected ()
    extends Component[ColsProps, js.Object, Any] {
    def this(props: ColsProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: ColsProps, context: Any) = this()
  }
  
  @JSImport("react-native-table-component", "Row")
  @js.native
  open class Row protected ()
    extends Component[RowProps, js.Object, Any] {
    def this(props: RowProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: RowProps, context: Any) = this()
  }
  
  @JSImport("react-native-table-component", "Rows")
  @js.native
  open class Rows protected ()
    extends Component[RowsProps, js.Object, Any] {
    def this(props: RowsProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: RowsProps, context: Any) = this()
  }
  
  @JSImport("react-native-table-component", "Table")
  @js.native
  open class Table protected ()
    extends Component[TableProps, js.Object, Any] {
    def this(props: TableProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: TableProps, context: Any) = this()
    
    def _renderChildren(props: TableProps): Node = js.native
  }
  
  @JSImport("react-native-table-component", "TableWrapper")
  @js.native
  open class TableWrapper protected ()
    extends Component[TableWrapperProps, js.Object, Any] {
    def this(props: TableWrapperProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: TableWrapperProps, context: Any) = this()
    
    def _renderChildren(props: TableWrapperProps): Node = js.native
  }
  
  trait CellProps extends StObject {
    
    var borderStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
    
    var data: js.UndefOr[Any] = js.undefined
    
    var flex: js.UndefOr[Double] = js.undefined
    
    var height: js.UndefOr[Double] = js.undefined
    
    var style: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
    
    var textStyle: js.UndefOr[StyleProp[TextStyle]] = js.undefined
    
    var width: js.UndefOr[Double] = js.undefined
  }
  object CellProps {
    
    inline def apply(): CellProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CellProps]
    }
    
    extension [Self <: CellProps](x: Self) {
      
      inline def setBorderStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "borderStyle", value.asInstanceOf[js.Any])
      
      inline def setBorderStyleNull: Self = StObject.set(x, "borderStyle", null)
      
      inline def setBorderStyleUndefined: Self = StObject.set(x, "borderStyle", js.undefined)
      
      inline def setData(value: Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      inline def setFlex(value: Double): Self = StObject.set(x, "flex", value.asInstanceOf[js.Any])
      
      inline def setFlexUndefined: Self = StObject.set(x, "flex", js.undefined)
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleNull: Self = StObject.set(x, "style", null)
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setTextStyle(value: StyleProp[TextStyle]): Self = StObject.set(x, "textStyle", value.asInstanceOf[js.Any])
      
      inline def setTextStyleNull: Self = StObject.set(x, "textStyle", null)
      
      inline def setTextStyleUndefined: Self = StObject.set(x, "textStyle", js.undefined)
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  trait ColProps extends StObject {
    
    var data: js.UndefOr[js.Array[Any]] = js.undefined
    
    var heightArr: js.UndefOr[js.Array[Double]] = js.undefined
    
    var style: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
    
    var textStyle: js.UndefOr[StyleProp[TextStyle]] = js.undefined
    
    var width: js.UndefOr[Double] = js.undefined
  }
  object ColProps {
    
    inline def apply(): ColProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ColProps]
    }
    
    extension [Self <: ColProps](x: Self) {
      
      inline def setData(value: js.Array[Any]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      inline def setDataVarargs(value: Any*): Self = StObject.set(x, "data", js.Array(value*))
      
      inline def setHeightArr(value: js.Array[Double]): Self = StObject.set(x, "heightArr", value.asInstanceOf[js.Any])
      
      inline def setHeightArrUndefined: Self = StObject.set(x, "heightArr", js.undefined)
      
      inline def setHeightArrVarargs(value: Double*): Self = StObject.set(x, "heightArr", js.Array(value*))
      
      inline def setStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleNull: Self = StObject.set(x, "style", null)
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setTextStyle(value: StyleProp[TextStyle]): Self = StObject.set(x, "textStyle", value.asInstanceOf[js.Any])
      
      inline def setTextStyleNull: Self = StObject.set(x, "textStyle", null)
      
      inline def setTextStyleUndefined: Self = StObject.set(x, "textStyle", js.undefined)
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  trait ColsProps extends StObject {
    
    var data: js.UndefOr[js.Array[Any]] = js.undefined
    
    var flexArr: js.UndefOr[js.Array[Double]] = js.undefined
    
    var heightArr: js.UndefOr[js.Array[Double]] = js.undefined
    
    var style: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
    
    var textStyle: js.UndefOr[StyleProp[TextStyle]] = js.undefined
    
    var widthArr: js.UndefOr[js.Array[Double]] = js.undefined
  }
  object ColsProps {
    
    inline def apply(): ColsProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ColsProps]
    }
    
    extension [Self <: ColsProps](x: Self) {
      
      inline def setData(value: js.Array[Any]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      inline def setDataVarargs(value: Any*): Self = StObject.set(x, "data", js.Array(value*))
      
      inline def setFlexArr(value: js.Array[Double]): Self = StObject.set(x, "flexArr", value.asInstanceOf[js.Any])
      
      inline def setFlexArrUndefined: Self = StObject.set(x, "flexArr", js.undefined)
      
      inline def setFlexArrVarargs(value: Double*): Self = StObject.set(x, "flexArr", js.Array(value*))
      
      inline def setHeightArr(value: js.Array[Double]): Self = StObject.set(x, "heightArr", value.asInstanceOf[js.Any])
      
      inline def setHeightArrUndefined: Self = StObject.set(x, "heightArr", js.undefined)
      
      inline def setHeightArrVarargs(value: Double*): Self = StObject.set(x, "heightArr", js.Array(value*))
      
      inline def setStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleNull: Self = StObject.set(x, "style", null)
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setTextStyle(value: StyleProp[TextStyle]): Self = StObject.set(x, "textStyle", value.asInstanceOf[js.Any])
      
      inline def setTextStyleNull: Self = StObject.set(x, "textStyle", null)
      
      inline def setTextStyleUndefined: Self = StObject.set(x, "textStyle", js.undefined)
      
      inline def setWidthArr(value: js.Array[Double]): Self = StObject.set(x, "widthArr", value.asInstanceOf[js.Any])
      
      inline def setWidthArrUndefined: Self = StObject.set(x, "widthArr", js.undefined)
      
      inline def setWidthArrVarargs(value: Double*): Self = StObject.set(x, "widthArr", js.Array(value*))
    }
  }
  
  trait RowProps extends StObject {
    
    var data: js.UndefOr[js.Array[Any]] = js.undefined
    
    var flexArr: js.UndefOr[js.Array[Double]] = js.undefined
    
    var height: js.UndefOr[Double] = js.undefined
    
    var style: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
    
    var textStyle: js.UndefOr[StyleProp[TextStyle]] = js.undefined
    
    var widthArr: js.UndefOr[js.Array[Double]] = js.undefined
  }
  object RowProps {
    
    inline def apply(): RowProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RowProps]
    }
    
    extension [Self <: RowProps](x: Self) {
      
      inline def setData(value: js.Array[Any]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      inline def setDataVarargs(value: Any*): Self = StObject.set(x, "data", js.Array(value*))
      
      inline def setFlexArr(value: js.Array[Double]): Self = StObject.set(x, "flexArr", value.asInstanceOf[js.Any])
      
      inline def setFlexArrUndefined: Self = StObject.set(x, "flexArr", js.undefined)
      
      inline def setFlexArrVarargs(value: Double*): Self = StObject.set(x, "flexArr", js.Array(value*))
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleNull: Self = StObject.set(x, "style", null)
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setTextStyle(value: StyleProp[TextStyle]): Self = StObject.set(x, "textStyle", value.asInstanceOf[js.Any])
      
      inline def setTextStyleNull: Self = StObject.set(x, "textStyle", null)
      
      inline def setTextStyleUndefined: Self = StObject.set(x, "textStyle", js.undefined)
      
      inline def setWidthArr(value: js.Array[Double]): Self = StObject.set(x, "widthArr", value.asInstanceOf[js.Any])
      
      inline def setWidthArrUndefined: Self = StObject.set(x, "widthArr", js.undefined)
      
      inline def setWidthArrVarargs(value: Double*): Self = StObject.set(x, "widthArr", js.Array(value*))
    }
  }
  
  trait RowsProps extends StObject {
    
    var data: js.UndefOr[js.Array[js.Array[Any]]] = js.undefined
    
    var flexArr: js.UndefOr[js.Array[Double]] = js.undefined
    
    var heightArr: js.UndefOr[js.Array[Double]] = js.undefined
    
    var style: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
    
    var textStyle: js.UndefOr[StyleProp[TextStyle]] = js.undefined
    
    var widthArr: js.UndefOr[js.Array[Double]] = js.undefined
  }
  object RowsProps {
    
    inline def apply(): RowsProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RowsProps]
    }
    
    extension [Self <: RowsProps](x: Self) {
      
      inline def setData(value: js.Array[js.Array[Any]]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      inline def setDataVarargs(value: js.Array[Any]*): Self = StObject.set(x, "data", js.Array(value*))
      
      inline def setFlexArr(value: js.Array[Double]): Self = StObject.set(x, "flexArr", value.asInstanceOf[js.Any])
      
      inline def setFlexArrUndefined: Self = StObject.set(x, "flexArr", js.undefined)
      
      inline def setFlexArrVarargs(value: Double*): Self = StObject.set(x, "flexArr", js.Array(value*))
      
      inline def setHeightArr(value: js.Array[Double]): Self = StObject.set(x, "heightArr", value.asInstanceOf[js.Any])
      
      inline def setHeightArrUndefined: Self = StObject.set(x, "heightArr", js.undefined)
      
      inline def setHeightArrVarargs(value: Double*): Self = StObject.set(x, "heightArr", js.Array(value*))
      
      inline def setStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleNull: Self = StObject.set(x, "style", null)
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setTextStyle(value: StyleProp[TextStyle]): Self = StObject.set(x, "textStyle", value.asInstanceOf[js.Any])
      
      inline def setTextStyleNull: Self = StObject.set(x, "textStyle", null)
      
      inline def setTextStyleUndefined: Self = StObject.set(x, "textStyle", js.undefined)
      
      inline def setWidthArr(value: js.Array[Double]): Self = StObject.set(x, "widthArr", value.asInstanceOf[js.Any])
      
      inline def setWidthArrUndefined: Self = StObject.set(x, "widthArr", js.undefined)
      
      inline def setWidthArrVarargs(value: Double*): Self = StObject.set(x, "widthArr", js.Array(value*))
    }
  }
  
  trait TableProps extends StObject {
    
    var borderStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
    
    var children: js.UndefOr[Node] = js.undefined
    
    var style: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  }
  object TableProps {
    
    inline def apply(): TableProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TableProps]
    }
    
    extension [Self <: TableProps](x: Self) {
      
      inline def setBorderStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "borderStyle", value.asInstanceOf[js.Any])
      
      inline def setBorderStyleNull: Self = StObject.set(x, "borderStyle", null)
      
      inline def setBorderStyleUndefined: Self = StObject.set(x, "borderStyle", js.undefined)
      
      inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
      
      inline def setChildrenNull: Self = StObject.set(x, "children", null)
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setChildrenVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
      
      inline def setStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleNull: Self = StObject.set(x, "style", null)
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
  
  trait TableWrapperProps extends StObject {
    
    var borderStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
    
    var children: js.UndefOr[Node] = js.undefined
    
    var style: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  }
  object TableWrapperProps {
    
    inline def apply(): TableWrapperProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TableWrapperProps]
    }
    
    extension [Self <: TableWrapperProps](x: Self) {
      
      inline def setBorderStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "borderStyle", value.asInstanceOf[js.Any])
      
      inline def setBorderStyleNull: Self = StObject.set(x, "borderStyle", null)
      
      inline def setBorderStyleUndefined: Self = StObject.set(x, "borderStyle", js.undefined)
      
      inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
      
      inline def setChildrenNull: Self = StObject.set(x, "children", null)
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setChildrenVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
      
      inline def setStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleNull: Self = StObject.set(x, "style", null)
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
}
