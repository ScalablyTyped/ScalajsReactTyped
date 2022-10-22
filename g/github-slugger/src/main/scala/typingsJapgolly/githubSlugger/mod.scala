package typingsJapgolly.githubSlugger

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("github-slugger", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends StObject
       with BananaSlug
  @JSImport("github-slugger", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    *
    * @param value  string of text to slugify
    * @param [maintainCase=false] Keep the current case, otherwise make all lowercase
    */
  /* static member */
  inline def slug(value: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("slug")(value.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def slug(value: String, maintainCase: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("slug")(value.asInstanceOf[js.Any], maintainCase.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def slug(value: Any): String = ^.asInstanceOf[js.Dynamic].applyDynamic("slug")(value.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def slug(value: Any, maintainCase: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("slug")(value.asInstanceOf[js.Any], maintainCase.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @js.native
  trait BananaSlug extends StObject {
    
    /**
      * Forget all previous slugs
      */
    def reset(): Unit = js.native
    
    /**
      *
      * @param value  string of text to slugify
      * @param [maintainCase=false] Keep the current case, otherwise make all lowercase
      */
    def slug(value: String): String = js.native
    def slug(value: String, maintainCase: Boolean): String = js.native
  }
}
