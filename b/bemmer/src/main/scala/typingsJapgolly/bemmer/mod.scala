package typingsJapgolly.bemmer

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("bemmer", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def create(classnames: String*): Builder = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(classnames.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Builder]
  
  inline def createBuilder(classnames: String*): Builder = ^.asInstanceOf[js.Dynamic].applyDynamic("createBuilder")(classnames.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Builder]
  
  inline def isBuilder(target: Any): /* is bemmer.bemmer.Builder */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isBuilder")(target.asInstanceOf[js.Any]).asInstanceOf[/* is bemmer.bemmer.Builder */ Boolean]
  
  type Builder = js.Function2[
    /* classname */ js.UndefOr[String], 
    /* modifiers */ js.UndefOr[StringDictionary[Any]], 
    String
  ]
}
