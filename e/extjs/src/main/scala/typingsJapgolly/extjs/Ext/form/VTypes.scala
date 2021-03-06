package typingsJapgolly.extjs.Ext.form

import typingsJapgolly.extjs.Ext.IBase
import typingsJapgolly.extjs.Ext.IClass
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Ext.form.VTypes")
@js.native
class VTypes () extends js.Object

/* static members */
@JSGlobal("Ext.form.VTypes")
@js.native
object VTypes extends js.Object {
  /** [Property] (RegExp) */
  var alphaMask: js.RegExp = js.native
  /** [Property] (String) */
  var alphaText: String = js.native
  /** [Property] (RegExp) */
  var alphanumMask: js.RegExp = js.native
  /** [Property] (String) */
  var alphanumText: String = js.native
  /** [Property] (RegExp) */
  var emailMask: js.RegExp = js.native
  /** [Property] (String) */
  var emailText: String = js.native
  /** [Property] (Ext.Class) */
  var self: IClass = js.native
  /** [Property] (String) */
  var urlText: String = js.native
  /** [Method] The function used to validate alpha values
  		* @param value String The value
  		* @returns Boolean true if the RegExp test passed, and false if not.
  		*/
  def alpha(): Boolean = js.native
  def alpha(value: String): Boolean = js.native
  /** [Method] The function used to validate alphanumeric values
  		* @param value String The value
  		* @returns Boolean true if the RegExp test passed, and false if not.
  		*/
  def alphanum(): Boolean = js.native
  def alphanum(value: String): Boolean = js.native
  /** [Method] Call the original method that was previously overridden with override Ext define My Cat  constructor functi
  		* @param args Array/Arguments The arguments, either an array or the arguments object from the current method, for example: this.callOverridden(arguments)
  		* @returns Object Returns the result of calling the overridden method
  		*/
  def callOverridden(): js.Any = js.native
  def callOverridden(args: js.Any): js.Any = js.native
  /** [Method] Call the parent method of the current method
  		* @param args Array/Arguments The arguments, either an array or the arguments object from the current method, for example: this.callParent(arguments)
  		* @returns Object Returns the result of calling the parent method
  		*/
  def callParent(): js.Any = js.native
  def callParent(args: js.Any): js.Any = js.native
  /** [Method] This method is used by an override to call the superclass method but bypass any overridden method
  		* @param args Array/Arguments The arguments, either an array or the arguments object from the current method, for example: this.callSuper(arguments)
  		* @returns Object Returns the result of calling the superclass method
  		*/
  def callSuper(): js.Any = js.native
  def callSuper(args: js.Any): js.Any = js.native
  /** [Method] The function used to validate email addresses
  		* @param value String The email address
  		* @returns Boolean true if the RegExp test passed, and false if not.
  		*/
  def email(): Boolean = js.native
  def email(value: String): Boolean = js.native
  /** [Method] Returns the initial configuration passed to constructor when instantiating this class
  		* @param name String Name of the config option to return.
  		* @returns Object/Mixed The full config object or a single config value when name parameter specified.
  		*/
  def getInitialConfig(): js.Any = js.native
  def getInitialConfig(name: String): js.Any = js.native
  /** [Method] Initialize configuration for this class
  		* @param config Object
  		* @returns Ext.Base this
  		*/
  def initConfig(): IBase = js.native
  def initConfig(config: js.Any): IBase = js.native
  /** [Method] Get the reference to the class from which this object was instantiated
  		* @returns Ext.Class
  		*/
  def statics(): IClass = js.native
  /** [Method] The function used to validate URLs
  		* @param value String The URL
  		* @returns Boolean true if the RegExp test passed, and false if not.
  		*/
  def url(): Boolean = js.native
  def url(value: String): Boolean = js.native
}

