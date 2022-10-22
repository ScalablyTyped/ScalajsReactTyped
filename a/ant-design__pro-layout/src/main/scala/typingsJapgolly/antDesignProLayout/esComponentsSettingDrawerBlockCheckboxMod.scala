package typingsJapgolly.antDesignProLayout

import japgolly.scalajs.react.Callback
import typingsJapgolly.antDesignProLayout.anon.Icon
import typingsJapgolly.react.mod.FC
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esComponentsSettingDrawerBlockCheckboxMod {
  
  @JSImport("@ant-design/pro-layout/es/components/SettingDrawer/BlockCheckbox", "BlockCheckbox")
  @js.native
  val BlockCheckbox: FC[BlockCheckboxProps] = js.native
  
  trait BlockCheckboxProps extends StObject {
    
    var configType: String
    
    var hashId: String
    
    var list: js.UndefOr[js.Array[Icon]] = js.undefined
    
    def onChange(key: String): Unit
    
    var prefixCls: String
    
    var value: String
  }
  object BlockCheckboxProps {
    
    inline def apply(configType: String, hashId: String, onChange: String => Callback, prefixCls: String, value: String): BlockCheckboxProps = {
      val __obj = js.Dynamic.literal(configType = configType.asInstanceOf[js.Any], hashId = hashId.asInstanceOf[js.Any], onChange = js.Any.fromFunction1((t0: String) => onChange(t0).runNow()), prefixCls = prefixCls.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[BlockCheckboxProps]
    }
    
    extension [Self <: BlockCheckboxProps](x: Self) {
      
      inline def setConfigType(value: String): Self = StObject.set(x, "configType", value.asInstanceOf[js.Any])
      
      inline def setHashId(value: String): Self = StObject.set(x, "hashId", value.asInstanceOf[js.Any])
      
      inline def setList(value: js.Array[Icon]): Self = StObject.set(x, "list", value.asInstanceOf[js.Any])
      
      inline def setListUndefined: Self = StObject.set(x, "list", js.undefined)
      
      inline def setListVarargs(value: Icon*): Self = StObject.set(x, "list", js.Array(value*))
      
      inline def setOnChange(value: String => Callback): Self = StObject.set(x, "onChange", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
      
      inline def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
}
