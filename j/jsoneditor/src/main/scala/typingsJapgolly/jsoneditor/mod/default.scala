package typingsJapgolly.jsoneditor.mod

import org.scalajs.dom.HTMLElement
import typingsJapgolly.ace.AceAjax.Ace
import typingsJapgolly.ajv.mod.Ajv
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("jsoneditor", JSImport.Default)
@js.native
open class default protected ()
  extends StObject
     with JSONEditor {
  /**
    * Constructs a new JSONEditor.
    * @param container An HTML DIV element. The JSONEditor will be created inside this container element.
    * @param options Optional object with options.
    * @param json Initial JSON data to be loaded into the JSONEditor. Alternatively, the method JSONEditor.set(json) can be used to load JSON data into the editor.
    * @returns New instance of a JSONEditor.
    */
  def this(container: HTMLElement) = this()
  def this(container: HTMLElement, options: JSONEditorOptions) = this()
  def this(container: HTMLElement, options: Unit, json: Any) = this()
  def this(container: HTMLElement, options: JSONEditorOptions, json: Any) = this()
}
/* static members */
object default {
  
  @JSImport("jsoneditor", JSImport.Default)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Access to the bundled ajv library, used for JSON schema validation. Same as `var Ajv = require('ajv');`.
    */
  @JSImport("jsoneditor", "default.Ajv")
  @js.native
  def Ajv: typingsJapgolly.ajv.mod.Ajv = js.native
  inline def Ajv_=(x: Ajv): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Ajv")(x.asInstanceOf[js.Any])
  
  /**
    * An array with the names of all known options.
    */
  @JSImport("jsoneditor", "default.VALID_OPTIONS")
  @js.native
  def VALID_OPTIONS: js.Array[String] = js.native
  inline def VALID_OPTIONS_=(x: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("VALID_OPTIONS")(x.asInstanceOf[js.Any])
  
  /**
    * Access to the bundled vanilla-picker library, used as color picker. Same as `var VanillaPicker = require('vanilla-picker');`.
    */
  @JSImport("jsoneditor", "default.VanillaPicker")
  @js.native
  def VanillaPicker: Any = js.native
  inline def VanillaPicker_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("VanillaPicker")(x.asInstanceOf[js.Any])
  
  /**
    * Access to the bundled Ace editor, via the brace library. Ace is used in code mode. Same as `var ace = require('brace');`.
    */
  @JSImport("jsoneditor", "default.ace")
  @js.native
  def ace: Ace = js.native
  inline def ace_=(x: Ace): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ace")(x.asInstanceOf[js.Any])
}
