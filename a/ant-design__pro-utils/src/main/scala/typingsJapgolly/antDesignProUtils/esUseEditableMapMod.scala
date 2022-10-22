package typingsJapgolly.antDesignProUtils

import typingsJapgolly.antDesignProUtils.anon.CancelEditable
import typingsJapgolly.antDesignProUtils.anon.SetDataSource
import typingsJapgolly.antDesignProUtils.antDesignProUtilsStrings.bottom
import typingsJapgolly.antDesignProUtils.antDesignProUtilsStrings.top
import typingsJapgolly.antDesignProUtils.esUseEditableArrayMod.RowEditableConfig
import typingsJapgolly.react.mod.Key
import typingsJapgolly.std.ReturnType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esUseEditableMapMod {
  
  @JSImport("@ant-design/pro-utils/es/useEditableMap", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def useEditableMap[RecordType](props: RowEditableConfig[RecordType] & SetDataSource[RecordType]): CancelEditable[RecordType] = ^.asInstanceOf[js.Dynamic].applyDynamic("useEditableMap")(props.asInstanceOf[js.Any]).asInstanceOf[CancelEditable[RecordType]]
  
  trait AddLineOptions extends StObject {
    
    var position: js.UndefOr[top | bottom] = js.undefined
    
    var recordKey: js.UndefOr[Key] = js.undefined
  }
  object AddLineOptions {
    
    inline def apply(): AddLineOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AddLineOptions]
    }
    
    extension [Self <: AddLineOptions](x: Self) {
      
      inline def setPosition(value: top | bottom): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
      
      inline def setRecordKey(value: Key): Self = StObject.set(x, "recordKey", value.asInstanceOf[js.Any])
      
      inline def setRecordKeyUndefined: Self = StObject.set(x, "recordKey", js.undefined)
    }
  }
  
  @js.native
  trait UseEditableMapType extends StObject {
    
    def apply[RecordType](props: RowEditableConfig[RecordType] & SetDataSource[RecordType]): CancelEditable[RecordType] = js.native
  }
  
  type UseEditableMapUtilType = ReturnType[UseEditableMapType]
}
