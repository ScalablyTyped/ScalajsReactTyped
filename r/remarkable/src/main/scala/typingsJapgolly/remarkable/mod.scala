package typingsJapgolly.remarkable

import typingsJapgolly.remarkable.libMod.Options
import typingsJapgolly.remarkable.libMod.^
import typingsJapgolly.remarkable.remarkableStrings.commonmark
import typingsJapgolly.remarkable.remarkableStrings.default
import typingsJapgolly.remarkable.remarkableStrings.full
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("remarkable", "Remarkable")
  @js.native
  /**
    * Markdown parser, done right.
    */
  open class Remarkable () extends ^ {
    def this(options: Options) = this()
    /**
      * Remarkable offers some "presets" as a convenience to quickly enable/disable
      * active syntax rules and options for common use cases.
      */
    def this(preset: commonmark | full | default) = this()
    def this(preset: commonmark | full | default, options: Options) = this()
  }
  object Remarkable {
    
    /**
      * Useful helper functions for custom rendering.
      */
    /* static member */
    object utils {
      
      @JSImport("remarkable", "Remarkable.utils")
      @js.native
      val ^ : js.Any = js.native
      
      inline def assign(target: Any, sources: Any*): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("assign")(scala.List(target.asInstanceOf[js.Any]).`++`(sources.asInstanceOf[Seq[js.Any]])*).asInstanceOf[Any]
      
      inline def escapeHtml(str: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("escapeHtml")(str.asInstanceOf[js.Any]).asInstanceOf[String]
      
      inline def fromCodePoint(c: Double): String = ^.asInstanceOf[js.Dynamic].applyDynamic("fromCodePoint")(c.asInstanceOf[js.Any]).asInstanceOf[String]
      
      inline def has(`object`: Any, key: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("has")(`object`.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[Boolean]
      
      inline def isString(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isString")().asInstanceOf[Boolean]
      inline def isString(obj: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isString")(obj.asInstanceOf[js.Any]).asInstanceOf[Boolean]
      
      inline def isValidEntityCode(c: Double): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isValidEntityCode")(c.asInstanceOf[js.Any]).asInstanceOf[Boolean]
      
      inline def replaceEntities(str: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("replaceEntities")(str.asInstanceOf[js.Any]).asInstanceOf[String]
      
      inline def unescapeMd(str: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("unescapeMd")(str.asInstanceOf[js.Any]).asInstanceOf[String]
    }
  }
}
