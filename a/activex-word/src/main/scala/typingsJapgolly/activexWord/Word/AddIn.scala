package typingsJapgolly.activexWord.Word

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AddIn extends StObject {
  
  val Application: typingsJapgolly.activexWord.Word.Application
  
  val Autoload: Boolean
  
  val Compiled: Boolean
  
  val Creator: Double
  
  def Delete(): Unit
  
  val Index: Double
  
  var Installed: Boolean
  
  val Name: String
  
  val Parent: Any
  
  val Path: String
  
  /* private */ @JSName("Word.AddIn_typekey")
  var WordDotAddIn_typekey: AddIn
}
object AddIn {
  
  inline def apply(
    Application: Application,
    Autoload: Boolean,
    Compiled: Boolean,
    Creator: Double,
    Delete: Callback,
    Index: Double,
    Installed: Boolean,
    Name: String,
    Parent: Any,
    Path: String,
    WordDotAddIn_typekey: AddIn
  ): AddIn = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Autoload = Autoload.asInstanceOf[js.Any], Compiled = Compiled.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Delete = Delete.toJsFn, Index = Index.asInstanceOf[js.Any], Installed = Installed.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Path = Path.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.AddIn_typekey")(WordDotAddIn_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddIn]
  }
  
  extension [Self <: AddIn](x: Self) {
    
    inline def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    inline def setAutoload(value: Boolean): Self = StObject.set(x, "Autoload", value.asInstanceOf[js.Any])
    
    inline def setCompiled(value: Boolean): Self = StObject.set(x, "Compiled", value.asInstanceOf[js.Any])
    
    inline def setCreator(value: Double): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    inline def setDelete(value: Callback): Self = StObject.set(x, "Delete", value.toJsFn)
    
    inline def setIndex(value: Double): Self = StObject.set(x, "Index", value.asInstanceOf[js.Any])
    
    inline def setInstalled(value: Boolean): Self = StObject.set(x, "Installed", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setParent(value: Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    inline def setPath(value: String): Self = StObject.set(x, "Path", value.asInstanceOf[js.Any])
    
    inline def setWordDotAddIn_typekey(value: AddIn): Self = StObject.set(x, "Word.AddIn_typekey", value.asInstanceOf[js.Any])
  }
}
