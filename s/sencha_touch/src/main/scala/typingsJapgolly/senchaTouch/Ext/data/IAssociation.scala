package typingsJapgolly.senchaTouch.Ext.data

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.senchaTouch.Ext.Array
import typingsJapgolly.senchaTouch.Ext.IBase
import typingsJapgolly.senchaTouch.Ext.IClass
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IAssociation extends IBase {
  /** [Config Option] (String) */
  var associatedModel: js.UndefOr[String] = js.undefined
  /** [Config Option] (String) */
  var associatedName: js.UndefOr[String] = js.undefined
  /** [Config Option] (String) */
  var associationKey: js.UndefOr[String] = js.undefined
  /** [Method] Returns the value of associatedModel
  		* @returns String
  		*/
  var getAssociatedModel: js.UndefOr[js.Function0[String]] = js.undefined
  /** [Method] Returns the value of associatedName
  		* @returns String
  		*/
  var getAssociatedName: js.UndefOr[js.Function0[String]] = js.undefined
  /** [Method] Returns the value of associationKey
  		* @returns String
  		*/
  var getAssociationKey: js.UndefOr[js.Function0[String]] = js.undefined
  /** [Method] Returns the value of name
  		* @returns Object
  		*/
  var getName: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the value of ownerModel
  		* @returns Ext.data.Model/String
  		*/
  var getOwnerModel: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the value of ownerName
  		* @returns String
  		*/
  var getOwnerName: js.UndefOr[js.Function0[String]] = js.undefined
  /** [Method] Returns the value of primaryKey
  		* @returns String
  		*/
  var getPrimaryKey: js.UndefOr[js.Function0[String]] = js.undefined
  /** [Method] Returns the value of reader
  		* @returns Ext.data.reader.Reader
  		*/
  var getReader: js.UndefOr[js.Function0[typingsJapgolly.senchaTouch.Ext.data.reader.IReader]] = js.undefined
  /** [Method] Returns the value of type
  		* @returns String
  		*/
  var getType: js.UndefOr[js.Function0[String]] = js.undefined
  /** [Config Option] (Ext.data.Model/String) */
  var ownerModel: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (String) */
  var primaryKey: js.UndefOr[String] = js.undefined
  /** [Config Option] (Ext.data.reader.Reader) */
  var reader: js.UndefOr[typingsJapgolly.senchaTouch.Ext.data.reader.IReader] = js.undefined
  /** [Method] Sets the value of associatedModel
  		* @param associatedModel String The new value.
  		*/
  var setAssociatedModel: js.UndefOr[js.Function1[/* associatedModel */ js.UndefOr[String], Unit]] = js.undefined
  /** [Method] Sets the value of associatedName
  		* @param associatedName String The new value.
  		*/
  var setAssociatedName: js.UndefOr[js.Function1[/* associatedName */ js.UndefOr[String], Unit]] = js.undefined
  /** [Method] Sets the value of associationKey
  		* @param associationKey String The new value.
  		*/
  var setAssociationKey: js.UndefOr[js.Function1[/* associationKey */ js.UndefOr[String], Unit]] = js.undefined
  /** [Method] Sets the value of name
  		* @param name Object The new value.
  		*/
  var setName: js.UndefOr[js.Function1[/* name */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] Sets the value of ownerModel
  		* @param ownerModel Ext.data.Model/String The new value.
  		*/
  var setOwnerModel: js.UndefOr[js.Function1[/* ownerModel */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] Sets the value of ownerName
  		* @param ownerName String The new value.
  		*/
  var setOwnerName: js.UndefOr[js.Function1[/* ownerName */ js.UndefOr[String], Unit]] = js.undefined
  /** [Method] Sets the value of primaryKey
  		* @param primaryKey String The new value.
  		*/
  var setPrimaryKey: js.UndefOr[js.Function1[/* primaryKey */ js.UndefOr[String], Unit]] = js.undefined
  /** [Method] Sets the value of reader
  		* @param reader Ext.data.reader.Reader The new value.
  		*/
  var setReader: js.UndefOr[
    js.Function1[/* reader */ js.UndefOr[typingsJapgolly.senchaTouch.Ext.data.reader.IReader], Unit]
  ] = js.undefined
  /** [Method] Sets the value of type
  		* @param type String The new value.
  		*/
  var setType: js.UndefOr[js.Function1[/* type */ js.UndefOr[String], Unit]] = js.undefined
  /** [Config Option] (String) */
  var `type`: js.UndefOr[String] = js.undefined
}

object IAssociation {
  @scala.inline
  def apply(
    alias: Array = null,
    alternateClassName: js.Any = null,
    associatedModel: String = null,
    associatedName: String = null,
    associationKey: String = null,
    callOverridden: /* args */ js.UndefOr[js.Any] => CallbackTo[js.Any] = null,
    callParent: /* args */ js.UndefOr[js.Any] => CallbackTo[js.Any] = null,
    callSuper: /* args */ js.UndefOr[js.Any] => CallbackTo[js.Any] = null,
    config: js.Any = null,
    destroy: js.UndefOr[Callback] = js.undefined,
    extend: String = null,
    getAssociatedModel: js.UndefOr[CallbackTo[String]] = js.undefined,
    getAssociatedName: js.UndefOr[CallbackTo[String]] = js.undefined,
    getAssociationKey: js.UndefOr[CallbackTo[String]] = js.undefined,
    getInitialConfig: /* name */ js.UndefOr[String] => CallbackTo[js.Any] = null,
    getName: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    getOwnerModel: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    getOwnerName: js.UndefOr[CallbackTo[String]] = js.undefined,
    getPrimaryKey: js.UndefOr[CallbackTo[String]] = js.undefined,
    getReader: js.UndefOr[CallbackTo[typingsJapgolly.senchaTouch.Ext.data.reader.IReader]] = js.undefined,
    getType: js.UndefOr[CallbackTo[String]] = js.undefined,
    inheritableStatics: js.Any = null,
    initConfig: /* instanceConfig */ js.UndefOr[js.Any] => CallbackTo[js.Any] = null,
    mixins: js.Any = null,
    ownerModel: js.Any = null,
    platformConfig: js.Any = null,
    primaryKey: String = null,
    reader: typingsJapgolly.senchaTouch.Ext.data.reader.IReader = null,
    self: IClass = null,
    setAssociatedModel: /* associatedModel */ js.UndefOr[String] => Callback = null,
    setAssociatedName: /* associatedName */ js.UndefOr[String] => Callback = null,
    setAssociationKey: /* associationKey */ js.UndefOr[String] => Callback = null,
    setName: /* name */ js.UndefOr[js.Any] => Callback = null,
    setOwnerModel: /* ownerModel */ js.UndefOr[js.Any] => Callback = null,
    setOwnerName: /* ownerName */ js.UndefOr[String] => Callback = null,
    setPrimaryKey: /* primaryKey */ js.UndefOr[String] => Callback = null,
    setReader: /* reader */ js.UndefOr[typingsJapgolly.senchaTouch.Ext.data.reader.IReader] => Callback = null,
    setType: /* type */ js.UndefOr[String] => Callback = null,
    singleton: js.UndefOr[Boolean] = js.undefined,
    statics: js.Any = null,
    `type`: String = null,
    uses: Array = null
  ): IAssociation = {
    val __obj = js.Dynamic.literal()
    if (alias != null) __obj.updateDynamic("alias")(alias.asInstanceOf[js.Any])
    if (alternateClassName != null) __obj.updateDynamic("alternateClassName")(alternateClassName.asInstanceOf[js.Any])
    if (associatedModel != null) __obj.updateDynamic("associatedModel")(associatedModel.asInstanceOf[js.Any])
    if (associatedName != null) __obj.updateDynamic("associatedName")(associatedName.asInstanceOf[js.Any])
    if (associationKey != null) __obj.updateDynamic("associationKey")(associationKey.asInstanceOf[js.Any])
    if (callOverridden != null) __obj.updateDynamic("callOverridden")(js.Any.fromFunction1((t0: /* args */ js.UndefOr[js.Any]) => callOverridden(t0).runNow()))
    if (callParent != null) __obj.updateDynamic("callParent")(js.Any.fromFunction1((t0: /* args */ js.UndefOr[js.Any]) => callParent(t0).runNow()))
    if (callSuper != null) __obj.updateDynamic("callSuper")(js.Any.fromFunction1((t0: /* args */ js.UndefOr[js.Any]) => callSuper(t0).runNow()))
    if (config != null) __obj.updateDynamic("config")(config.asInstanceOf[js.Any])
    destroy.foreach(p => __obj.updateDynamic("destroy")(p.toJsFn))
    if (extend != null) __obj.updateDynamic("extend")(extend.asInstanceOf[js.Any])
    getAssociatedModel.foreach(p => __obj.updateDynamic("getAssociatedModel")(p.toJsFn))
    getAssociatedName.foreach(p => __obj.updateDynamic("getAssociatedName")(p.toJsFn))
    getAssociationKey.foreach(p => __obj.updateDynamic("getAssociationKey")(p.toJsFn))
    if (getInitialConfig != null) __obj.updateDynamic("getInitialConfig")(js.Any.fromFunction1((t0: /* name */ js.UndefOr[java.lang.String]) => getInitialConfig(t0).runNow()))
    getName.foreach(p => __obj.updateDynamic("getName")(p.toJsFn))
    getOwnerModel.foreach(p => __obj.updateDynamic("getOwnerModel")(p.toJsFn))
    getOwnerName.foreach(p => __obj.updateDynamic("getOwnerName")(p.toJsFn))
    getPrimaryKey.foreach(p => __obj.updateDynamic("getPrimaryKey")(p.toJsFn))
    getReader.foreach(p => __obj.updateDynamic("getReader")(p.toJsFn))
    getType.foreach(p => __obj.updateDynamic("getType")(p.toJsFn))
    if (inheritableStatics != null) __obj.updateDynamic("inheritableStatics")(inheritableStatics.asInstanceOf[js.Any])
    if (initConfig != null) __obj.updateDynamic("initConfig")(js.Any.fromFunction1((t0: /* instanceConfig */ js.UndefOr[js.Any]) => initConfig(t0).runNow()))
    if (mixins != null) __obj.updateDynamic("mixins")(mixins.asInstanceOf[js.Any])
    if (ownerModel != null) __obj.updateDynamic("ownerModel")(ownerModel.asInstanceOf[js.Any])
    if (platformConfig != null) __obj.updateDynamic("platformConfig")(platformConfig.asInstanceOf[js.Any])
    if (primaryKey != null) __obj.updateDynamic("primaryKey")(primaryKey.asInstanceOf[js.Any])
    if (reader != null) __obj.updateDynamic("reader")(reader.asInstanceOf[js.Any])
    if (self != null) __obj.updateDynamic("self")(self.asInstanceOf[js.Any])
    if (setAssociatedModel != null) __obj.updateDynamic("setAssociatedModel")(js.Any.fromFunction1((t0: /* associatedModel */ js.UndefOr[java.lang.String]) => setAssociatedModel(t0).runNow()))
    if (setAssociatedName != null) __obj.updateDynamic("setAssociatedName")(js.Any.fromFunction1((t0: /* associatedName */ js.UndefOr[java.lang.String]) => setAssociatedName(t0).runNow()))
    if (setAssociationKey != null) __obj.updateDynamic("setAssociationKey")(js.Any.fromFunction1((t0: /* associationKey */ js.UndefOr[java.lang.String]) => setAssociationKey(t0).runNow()))
    if (setName != null) __obj.updateDynamic("setName")(js.Any.fromFunction1((t0: /* name */ js.UndefOr[js.Any]) => setName(t0).runNow()))
    if (setOwnerModel != null) __obj.updateDynamic("setOwnerModel")(js.Any.fromFunction1((t0: /* ownerModel */ js.UndefOr[js.Any]) => setOwnerModel(t0).runNow()))
    if (setOwnerName != null) __obj.updateDynamic("setOwnerName")(js.Any.fromFunction1((t0: /* ownerName */ js.UndefOr[java.lang.String]) => setOwnerName(t0).runNow()))
    if (setPrimaryKey != null) __obj.updateDynamic("setPrimaryKey")(js.Any.fromFunction1((t0: /* primaryKey */ js.UndefOr[java.lang.String]) => setPrimaryKey(t0).runNow()))
    if (setReader != null) __obj.updateDynamic("setReader")(js.Any.fromFunction1((t0: /* reader */ js.UndefOr[typingsJapgolly.senchaTouch.Ext.data.reader.IReader]) => setReader(t0).runNow()))
    if (setType != null) __obj.updateDynamic("setType")(js.Any.fromFunction1((t0: /* type */ js.UndefOr[java.lang.String]) => setType(t0).runNow()))
    if (!js.isUndefined(singleton)) __obj.updateDynamic("singleton")(singleton.asInstanceOf[js.Any])
    if (statics != null) __obj.updateDynamic("statics")(statics.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (uses != null) __obj.updateDynamic("uses")(uses.asInstanceOf[js.Any])
    __obj.asInstanceOf[IAssociation]
  }
}

