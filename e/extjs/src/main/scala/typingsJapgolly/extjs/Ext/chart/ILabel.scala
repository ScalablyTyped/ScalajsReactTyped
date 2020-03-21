package typingsJapgolly.extjs.Ext.chart

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.extjs.Ext.Array
import typingsJapgolly.extjs.Ext.IBase
import typingsJapgolly.extjs.Ext.IClass
import typingsJapgolly.extjs.Ext.data.IModel
import typingsJapgolly.extjs.Ext.draw.ISprite
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ILabel extends IBase {
  /** [Config Option] (Object) */
  var label: js.UndefOr[js.Any] = js.undefined
  /** [Method] Called each time a new label is created
  		* @param storeItem Ext.data.Model The element of the store that is related to the sprite.
  		* @param item Object The item related to the sprite. An item is an object containing the position of the shape used to describe the visualization and also pointing to the actual shape (circle, rectangle, path, etc).
  		* @param i Number The index of the element created (i.e the first created label, second created label, etc).
  		* @param display String The label.display type. May be false if the label is hidden
  		* @returns Ext.draw.Sprite The created sprite that will draw the label.
  		*/
  var onCreateLabel: js.UndefOr[
    js.Function4[
      /* storeItem */ js.UndefOr[IModel], 
      /* item */ js.UndefOr[js.Any], 
      /* i */ js.UndefOr[Double], 
      /* display */ js.UndefOr[String], 
      ISprite
    ]
  ] = js.undefined
  /** [Method] Called for updating the position of the label
  		* @param label Ext.draw.Sprite The sprite that draws the label.
  		* @param storeItem Ext.data.Model The element of the store that is related to the sprite.
  		* @param item Object The item related to the sprite. An item is an object containing the position of the shape used to describe the visualization and also pointing to the actual shape (circle, rectangle, path, etc).
  		* @param i Number The index of the element to be updated (i.e. whether it is the first, second, third from the labelGroup)
  		* @param display String The label.display type. May be false if the label is hidden
  		* @param animate Boolean A boolean value to set or unset animations for the labels.
  		* @param index Number The series index.
  		*/
  var onPlaceLabel: js.UndefOr[
    js.Function7[
      /* label */ js.UndefOr[ISprite], 
      /* storeItem */ js.UndefOr[IModel], 
      /* item */ js.UndefOr[js.Any], 
      /* i */ js.UndefOr[Double], 
      /* display */ js.UndefOr[String], 
      /* animate */ js.UndefOr[Boolean], 
      /* index */ js.UndefOr[Double], 
      Unit
    ]
  ] = js.undefined
}

object ILabel {
  @scala.inline
  def apply(
    alias: Array = null,
    alternateClassName: js.Any = null,
    callOverridden: /* args */ js.UndefOr[js.Any] => CallbackTo[js.Any] = null,
    callParent: /* args */ js.UndefOr[js.Any] => CallbackTo[js.Any] = null,
    callSuper: /* args */ js.UndefOr[js.Any] => CallbackTo[js.Any] = null,
    config: js.Any = null,
    extend: String = null,
    getInitialConfig: /* name */ js.UndefOr[String] => CallbackTo[js.Any] = null,
    inheritableStatics: js.Any = null,
    initConfig: /* config */ js.UndefOr[js.Any] => CallbackTo[ILabel] = null,
    label: js.Any = null,
    mixins: js.Any = null,
    onCreateLabel: (/* storeItem */ js.UndefOr[IModel], /* item */ js.UndefOr[js.Any], /* i */ js.UndefOr[Double], /* display */ js.UndefOr[String]) => CallbackTo[ISprite] = null,
    onPlaceLabel: (/* label */ js.UndefOr[ISprite], /* storeItem */ js.UndefOr[IModel], /* item */ js.UndefOr[js.Any], /* i */ js.UndefOr[Double], /* display */ js.UndefOr[String], /* animate */ js.UndefOr[Boolean], /* index */ js.UndefOr[Double]) => Callback = null,
    requires: Array = null,
    self: IClass = null,
    singleton: js.UndefOr[Boolean] = js.undefined,
    statics: js.Any = null,
    uses: Array = null
  ): ILabel = {
    val __obj = js.Dynamic.literal()
    if (alias != null) __obj.updateDynamic("alias")(alias.asInstanceOf[js.Any])
    if (alternateClassName != null) __obj.updateDynamic("alternateClassName")(alternateClassName.asInstanceOf[js.Any])
    if (callOverridden != null) __obj.updateDynamic("callOverridden")(js.Any.fromFunction1((t0: /* args */ js.UndefOr[js.Any]) => callOverridden(t0).runNow()))
    if (callParent != null) __obj.updateDynamic("callParent")(js.Any.fromFunction1((t0: /* args */ js.UndefOr[js.Any]) => callParent(t0).runNow()))
    if (callSuper != null) __obj.updateDynamic("callSuper")(js.Any.fromFunction1((t0: /* args */ js.UndefOr[js.Any]) => callSuper(t0).runNow()))
    if (config != null) __obj.updateDynamic("config")(config.asInstanceOf[js.Any])
    if (extend != null) __obj.updateDynamic("extend")(extend.asInstanceOf[js.Any])
    if (getInitialConfig != null) __obj.updateDynamic("getInitialConfig")(js.Any.fromFunction1((t0: /* name */ js.UndefOr[java.lang.String]) => getInitialConfig(t0).runNow()))
    if (inheritableStatics != null) __obj.updateDynamic("inheritableStatics")(inheritableStatics.asInstanceOf[js.Any])
    if (initConfig != null) __obj.updateDynamic("initConfig")(js.Any.fromFunction1((t0: /* config */ js.UndefOr[js.Any]) => initConfig(t0).runNow()))
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (mixins != null) __obj.updateDynamic("mixins")(mixins.asInstanceOf[js.Any])
    if (onCreateLabel != null) __obj.updateDynamic("onCreateLabel")(js.Any.fromFunction4((t0: /* storeItem */ js.UndefOr[typingsJapgolly.extjs.Ext.data.IModel], t1: /* item */ js.UndefOr[js.Any], t2: /* i */ js.UndefOr[scala.Double], t3: /* display */ js.UndefOr[java.lang.String]) => onCreateLabel(t0, t1, t2, t3).runNow()))
    if (onPlaceLabel != null) __obj.updateDynamic("onPlaceLabel")(js.Any.fromFunction7((t0: /* label */ js.UndefOr[typingsJapgolly.extjs.Ext.draw.ISprite], t1: /* storeItem */ js.UndefOr[typingsJapgolly.extjs.Ext.data.IModel], t2: /* item */ js.UndefOr[js.Any], t3: /* i */ js.UndefOr[scala.Double], t4: /* display */ js.UndefOr[java.lang.String], t5: /* animate */ js.UndefOr[scala.Boolean], t6: /* index */ js.UndefOr[scala.Double]) => onPlaceLabel(t0, t1, t2, t3, t4, t5, t6).runNow()))
    if (requires != null) __obj.updateDynamic("requires")(requires.asInstanceOf[js.Any])
    if (self != null) __obj.updateDynamic("self")(self.asInstanceOf[js.Any])
    if (!js.isUndefined(singleton)) __obj.updateDynamic("singleton")(singleton.asInstanceOf[js.Any])
    if (statics != null) __obj.updateDynamic("statics")(statics.asInstanceOf[js.Any])
    if (uses != null) __obj.updateDynamic("uses")(uses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ILabel]
  }
}

