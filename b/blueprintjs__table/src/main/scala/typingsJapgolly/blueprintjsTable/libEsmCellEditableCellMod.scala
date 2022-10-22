package typingsJapgolly.blueprintjsTable

import japgolly.scalajs.react.Callback
import typingsJapgolly.blueprintjsCore.libEsmComponentsEditableTextEditableTextMod.EditableTextProps
import typingsJapgolly.blueprintjsTable.anon.Truncated
import typingsJapgolly.blueprintjsTable.libEsmCellCellMod.ICellProps
import typingsJapgolly.react.mod.Component
import typingsJapgolly.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libEsmCellEditableCellMod {
  
  @JSImport("@blueprintjs/table/lib/esm/cell/editableCell", "EditableCell")
  @js.native
  open class EditableCell protected () extends Component[IEditableCellProps, IEditableCellState, Any] {
    def this(props: IEditableCellProps) = this()
    
    /* private */ var cellRef: Any = js.native
    
    /* private */ var checkShouldFocus: Any = js.native
    
    @JSName("componentDidMount")
    def componentDidMount_MEditableCell(): Unit = js.native
    
    @JSName("componentDidUpdate")
    def componentDidUpdate_MEditableCell(prevProps: IEditableCellProps): Unit = js.native
    
    /* private */ var handleCancel: Any = js.native
    
    /* private */ var handleCellActivate: Any = js.native
    
    /* private */ var handleCellDoubleClick: Any = js.native
    
    /* private */ var handleChange: Any = js.native
    
    /* private */ var handleConfirm: Any = js.native
    
    /* private */ var handleEdit: Any = js.native
    
    /* private */ var handleKeyPress: Any = js.native
    
    /* private */ var invokeCallback: Any = js.native
    
    /* private */ var refHandlers: Any = js.native
    
    def renderHotkeys(): Element = js.native
    
    @JSName("shouldComponentUpdate")
    def shouldComponentUpdate_MEditableCell(nextProps: IEditableCellProps, nextState: IEditableCellState): Boolean = js.native
  }
  /* static members */
  object EditableCell {
    
    @JSImport("@blueprintjs/table/lib/esm/cell/editableCell", "EditableCell")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@blueprintjs/table/lib/esm/cell/editableCell", "EditableCell.defaultProps")
    @js.native
    def defaultProps: Truncated = js.native
    inline def defaultProps_=(x: Truncated): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    @JSImport("@blueprintjs/table/lib/esm/cell/editableCell", "EditableCell.displayName")
    @js.native
    def displayName: String = js.native
    inline def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
  }
  
  type EditableCellProps = IEditableCellProps
  
  trait IEditableCellProps
    extends StObject
       with ICellProps {
    
    /**
      * Props that should be passed to the EditableText when it is used to edit
      */
    var editableTextProps: js.UndefOr[EditableTextProps] = js.undefined
    
    /**
      * Whether the given cell is the current active/focused cell.
      */
    var isFocused: js.UndefOr[Boolean] = js.undefined
    
    /**
      * A listener that is triggered if the user cancels the edit. This is
      * important to listen to if you are doing anything with `onChange` events,
      * since you'll likely want to revert whatever changes you made. The
      * callback will also receive the row index and column index if they were
      * originally provided via props.
      */
    var onCancel: js.UndefOr[
        js.Function3[
          /* value */ String, 
          /* rowIndex */ js.UndefOr[Double], 
          /* columnIndex */ js.UndefOr[Double], 
          Unit
        ]
      ] = js.undefined
    
    /**
      * A listener that is triggered as soon as the editable name is modified.
      * This can be due, for example, to keyboard input or the clipboard. The
      * callback will also receive the row index and column index if they were
      * originally provided via props.
      */
    var onChange: js.UndefOr[
        js.Function3[
          /* value */ String, 
          /* rowIndex */ js.UndefOr[Double], 
          /* columnIndex */ js.UndefOr[Double], 
          Unit
        ]
      ] = js.undefined
    
    /**
      * A listener that is triggered once the editing is confirmed. This is
      * usually due to the <code>return</code> (or <code>enter</code>) key press.
      * The callback will also receive the row index and column index if they
      * were originally provided via props.
      */
    var onConfirm: js.UndefOr[
        js.Function3[
          /* value */ String, 
          /* rowIndex */ js.UndefOr[Double], 
          /* columnIndex */ js.UndefOr[Double], 
          Unit
        ]
      ] = js.undefined
    
    /**
      * The value displayed in the text box. Be sure to update this value when
      * rendering this component after a confirmed change.
      */
    var value: js.UndefOr[String] = js.undefined
  }
  object IEditableCellProps {
    
    inline def apply(): IEditableCellProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IEditableCellProps]
    }
    
    extension [Self <: IEditableCellProps](x: Self) {
      
      inline def setEditableTextProps(value: EditableTextProps): Self = StObject.set(x, "editableTextProps", value.asInstanceOf[js.Any])
      
      inline def setEditableTextPropsUndefined: Self = StObject.set(x, "editableTextProps", js.undefined)
      
      inline def setIsFocused(value: Boolean): Self = StObject.set(x, "isFocused", value.asInstanceOf[js.Any])
      
      inline def setIsFocusedUndefined: Self = StObject.set(x, "isFocused", js.undefined)
      
      inline def setOnCancel(
        value: (/* value */ String, /* rowIndex */ js.UndefOr[Double], /* columnIndex */ js.UndefOr[Double]) => Callback
      ): Self = StObject.set(x, "onCancel", js.Any.fromFunction3((t0: /* value */ String, t1: /* rowIndex */ js.UndefOr[Double], t2: /* columnIndex */ js.UndefOr[Double]) => (value(t0, t1, t2)).runNow()))
      
      inline def setOnCancelUndefined: Self = StObject.set(x, "onCancel", js.undefined)
      
      inline def setOnChange(
        value: (/* value */ String, /* rowIndex */ js.UndefOr[Double], /* columnIndex */ js.UndefOr[Double]) => Callback
      ): Self = StObject.set(x, "onChange", js.Any.fromFunction3((t0: /* value */ String, t1: /* rowIndex */ js.UndefOr[Double], t2: /* columnIndex */ js.UndefOr[Double]) => (value(t0, t1, t2)).runNow()))
      
      inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      inline def setOnConfirm(
        value: (/* value */ String, /* rowIndex */ js.UndefOr[Double], /* columnIndex */ js.UndefOr[Double]) => Callback
      ): Self = StObject.set(x, "onConfirm", js.Any.fromFunction3((t0: /* value */ String, t1: /* rowIndex */ js.UndefOr[Double], t2: /* columnIndex */ js.UndefOr[Double]) => (value(t0, t1, t2)).runNow()))
      
      inline def setOnConfirmUndefined: Self = StObject.set(x, "onConfirm", js.undefined)
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  trait IEditableCellState extends StObject {
    
    var dirtyValue: js.UndefOr[String] = js.undefined
    
    var isEditing: js.UndefOr[Boolean] = js.undefined
    
    var savedValue: js.UndefOr[String] = js.undefined
  }
  object IEditableCellState {
    
    inline def apply(): IEditableCellState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IEditableCellState]
    }
    
    extension [Self <: IEditableCellState](x: Self) {
      
      inline def setDirtyValue(value: String): Self = StObject.set(x, "dirtyValue", value.asInstanceOf[js.Any])
      
      inline def setDirtyValueUndefined: Self = StObject.set(x, "dirtyValue", js.undefined)
      
      inline def setIsEditing(value: Boolean): Self = StObject.set(x, "isEditing", value.asInstanceOf[js.Any])
      
      inline def setIsEditingUndefined: Self = StObject.set(x, "isEditing", js.undefined)
      
      inline def setSavedValue(value: String): Self = StObject.set(x, "savedValue", value.asInstanceOf[js.Any])
      
      inline def setSavedValueUndefined: Self = StObject.set(x, "savedValue", js.undefined)
    }
  }
}
