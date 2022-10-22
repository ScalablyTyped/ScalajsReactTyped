package typingsJapgolly.nginstackEngine

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libJavaJavaImporterMod {
  
  inline def apply(): Unit = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Unit]
  
  @JSImport("@nginstack/engine/lib/java/JavaImporter", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends StObject
       with JavaImporter {
    
    /* CompleteClass */
    override def getClassesFromPackages(packageName: String): js.Array[Any] = js.native
    
    /* CompleteClass */
    override def importJavaBean(packageOrClassName: String): Unit = js.native
  }
  @JSImport("@nginstack/engine/lib/java/JavaImporter", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait JavaImporter extends StObject {
    
    def getClassesFromPackages(packageName: String): js.Array[Any]
    
    def importJavaBean(packageOrClassName: String): Unit
  }
  object JavaImporter {
    
    inline def apply(getClassesFromPackages: String => js.Array[Any], importJavaBean: String => Callback): JavaImporter = {
      val __obj = js.Dynamic.literal(getClassesFromPackages = js.Any.fromFunction1(getClassesFromPackages), importJavaBean = js.Any.fromFunction1((t0: String) => importJavaBean(t0).runNow()))
      __obj.asInstanceOf[JavaImporter]
    }
    
    extension [Self <: JavaImporter](x: Self) {
      
      inline def setGetClassesFromPackages(value: String => js.Array[Any]): Self = StObject.set(x, "getClassesFromPackages", js.Any.fromFunction1(value))
      
      inline def setImportJavaBean(value: String => Callback): Self = StObject.set(x, "importJavaBean", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    }
  }
}
