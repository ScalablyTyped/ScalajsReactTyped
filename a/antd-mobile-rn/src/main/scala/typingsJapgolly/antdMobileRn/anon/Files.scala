package typingsJapgolly.antdMobileRn.anon

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.reactNative.mod.RegisteredStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Files extends StObject {
  
  var files: js.Array[scala.Nothing]
  
  def onChange(): Unit
  
  def onFail(): Unit
  
  var selectable: Boolean
  
  var styles: StringDictionary[RegisteredStyle[Any]]
}
object Files {
  
  inline def apply(
    files: js.Array[scala.Nothing],
    onChange: Callback,
    onFail: Callback,
    selectable: Boolean,
    styles: StringDictionary[RegisteredStyle[Any]]
  ): Files = {
    val __obj = js.Dynamic.literal(files = files.asInstanceOf[js.Any], onChange = onChange.toJsFn, onFail = onFail.toJsFn, selectable = selectable.asInstanceOf[js.Any], styles = styles.asInstanceOf[js.Any])
    __obj.asInstanceOf[Files]
  }
  
  extension [Self <: Files](x: Self) {
    
    inline def setFiles(value: js.Array[scala.Nothing]): Self = StObject.set(x, "files", value.asInstanceOf[js.Any])
    
    inline def setFilesVarargs(value: scala.Nothing*): Self = StObject.set(x, "files", js.Array(value*))
    
    inline def setOnChange(value: Callback): Self = StObject.set(x, "onChange", value.toJsFn)
    
    inline def setOnFail(value: Callback): Self = StObject.set(x, "onFail", value.toJsFn)
    
    inline def setSelectable(value: Boolean): Self = StObject.set(x, "selectable", value.asInstanceOf[js.Any])
    
    inline def setStyles(value: StringDictionary[RegisteredStyle[Any]]): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
  }
}
