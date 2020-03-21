package typingsJapgolly.extjs.Ext.util

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.extjs.Ext.Array
import typingsJapgolly.extjs.Ext.IBase
import typingsJapgolly.extjs.Ext.IClass
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPositionable extends IBase {
  /** [Method] Aligns the element with another element relative to the specified anchor points
  		* @param element Ext.util.Positionable/HTMLElement/String The Positionable, HTMLElement, or id of the element to align to.
  		* @param position String The position to align to
  		* @param offsets Number[] Offset the positioning by [x, y]
  		* @param animate Boolean/Object true for the default animation or a standard Element animation config object
  		* @returns Ext.util.Positionable this
  		*/
  var alignTo: js.UndefOr[
    js.Function4[
      /* element */ js.UndefOr[js.Any], 
      /* position */ js.UndefOr[String], 
      /* offsets */ js.UndefOr[Array], 
      /* animate */ js.UndefOr[js.Any], 
      this.type
    ]
  ] = js.undefined
  /** [Method] Anchors an element to another element and realigns it when the window is resized
  		* @param element Ext.util.Positionable/HTMLElement/String The Positionable, HTMLElement, or id of the element to align to.
  		* @param position String The position to align to
  		* @param offsets Number[] Offset the positioning by [x, y]
  		* @param animate Boolean/Object true for the default animation or a standard Element animation config object
  		* @param monitorScroll Boolean/Number True to monitor body scroll and reposition. If this parameter is a number, it is used as the buffer delay in milliseconds.
  		* @param callback Function The function to call after the animation finishes
  		* @returns Ext.util.Positionable this
  		*/
  var anchorTo: js.UndefOr[
    js.Function6[
      /* element */ js.UndefOr[js.Any], 
      /* position */ js.UndefOr[String], 
      /* offsets */ js.UndefOr[Array], 
      /* animate */ js.UndefOr[js.Any], 
      /* monitorScroll */ js.UndefOr[js.Any], 
      /* callback */ js.UndefOr[js.Any], 
      this.type
    ]
  ] = js.undefined
  /** [Method] Calculates the new x y position to move this Positionable into a constrain region
  		* @param constrainTo String/HTMLElement/Ext.Element/Ext.util.Region The Element or Region into which this Component is to be constrained. Defaults to the element into which this Positionable was rendered, or this Component's {@link Ext.Component.constrainTo.
  		* @param proposedPosition Number[] A proposed [X, Y] position to test for validity and to coerce into constraints instead of using this Positionable's current position.
  		* @param local Boolean The proposedPosition is local (relative to floatParent if a floating Component)
  		* @param proposedSize Number[] A proposed [width, height] size to use when calculating constraints instead of using this Positionable's current size.
  		* @returns Number[] If the element needs to be translated, the new [X, Y] position within constraints if possible, giving priority to keeping the top and left edge in the constrain region. Otherwise, false.
  		*/
  var calculateConstrainedPosition: js.UndefOr[
    js.Function4[
      /* constrainTo */ js.UndefOr[js.Any], 
      /* proposedPosition */ js.UndefOr[Array], 
      /* local */ js.UndefOr[Boolean], 
      /* proposedSize */ js.UndefOr[Array], 
      Array
    ]
  ] = js.undefined
  /** [Method] Gets the x y coordinates to align this element with another element
  		* @param element Ext.util.Positionable/HTMLElement/String The Positionable, HTMLElement, or id of the element to align to.
  		* @param position String The position to align to
  		* @param offsets Number[] Offset the positioning by [x, y]
  		* @returns Number[] [x, y]
  		*/
  var getAlignToXY: js.UndefOr[
    js.Function3[
      /* element */ js.UndefOr[js.Any], 
      /* position */ js.UndefOr[String], 
      /* offsets */ js.UndefOr[Array], 
      Array
    ]
  ] = js.undefined
  /** [Method] Gets the x y coordinates specified by the anchor position on the element
  		* @param anchor String The specified anchor position. See alignTo for details on supported anchor positions.
  		* @param local Boolean True to get the local (element top/left-relative) anchor position instead of page coordinates
  		* @param size Object An object containing the size to use for calculating anchor position {width: (target width), height: (target height)} (defaults to the element's current size)
  		* @returns Number[] [x, y] An array containing the element's x and y coordinates
  		*/
  var getAnchorXY: js.UndefOr[
    js.Function3[
      /* anchor */ js.UndefOr[String], 
      /* local */ js.UndefOr[Boolean], 
      /* size */ js.UndefOr[js.Any], 
      Array
    ]
  ] = js.undefined
  /** [Method] Return an object defining the area of this Element which can be passed to setBox to set another Element s size locati
  		* @param contentBox Boolean If true a box for the content of the element is returned.
  		* @param local Boolean If true the element's left and top relative to its offsetParent are returned instead of page x/y.
  		* @returns Object box An object in the format: {  x: &lt;Element's X position&gt;,  y: &lt;Element's Y position&gt;,  left: &lt;Element's X position (an alias for x)&gt;,  top: &lt;Element's Y position (an alias for y)&gt;,  width: &lt;Element's width&gt;,  height: &lt;Element's height&gt;,  bottom: &lt;Element's lower bound&gt;,  right: &lt;Element's rightmost bound&gt; }  The returned object may also be addressed as an Array where index 0 contains the X position and index 1 contains the Y position. The result may also be used for setXY
  		*/
  var getBox: js.UndefOr[
    js.Function2[/* contentBox */ js.UndefOr[Boolean], /* local */ js.UndefOr[Boolean], _]
  ] = js.undefined
  /** [Method] Returns the X Y vector by which this Positionable s element must be translated to make a best attempt to constrain
  		* @param constrainTo Ext.util.Positionable/HTMLElement/String/Ext.util.Region The Positionable, HTMLElement, element id, or Region into which the element is to be constrained.
  		* @param proposedPosition Number[] A proposed [X, Y] position to test for validity and to produce a vector for instead of using the element's current position
  		* @param proposedSize Number[] A proposed [width, height] size to constrain instead of using the element's current size
  		* @returns Number[]/Boolean If the element needs to be translated, an [X, Y] vector by which this element must be translated. Otherwise, false.
  		*/
  var getConstrainVector: js.UndefOr[
    js.Function3[
      /* constrainTo */ js.UndefOr[js.Any], 
      /* proposedPosition */ js.UndefOr[Array], 
      /* proposedSize */ js.UndefOr[Array], 
      _
    ]
  ] = js.undefined
  /** [Method] Returns the x coordinate of this element reletive to its offsetParent
  		* @returns Number The local x coordinate
  		*/
  var getLocalX: js.UndefOr[js.Function0[Double]] = js.undefined
  /** [Method] Returns the x and y coordinates of this element relative to its offsetParent
  		* @returns Number[] The local XY position of the element
  		*/
  var getLocalXY: js.UndefOr[js.Function0[Array]] = js.undefined
  /** [Method] Returns the y coordinate of this element reletive to its offsetParent
  		* @returns Number The local y coordinate
  		*/
  var getLocalY: js.UndefOr[js.Function0[Double]] = js.undefined
  /** [Method] Returns the offsets of this element from the passed element
  		* @param offsetsTo Ext.util.Positionable/HTMLElement/String The Positionable, HTMLElement, or element id to get get the offsets from.
  		* @returns Number[] The XY page offsets (e.g. [100, -200])
  		*/
  var getOffsetsTo: js.UndefOr[js.Function1[/* offsetsTo */ js.UndefOr[js.Any], Array]] = js.undefined
  /** [Method] Returns a region object that defines the area of this element
  		* @returns Ext.util.Region A Region containing "top, left, bottom, right" properties.
  		*/
  var getRegion: js.UndefOr[js.Function0[IRegion]] = js.undefined
  /** [Method] Returns the content region of this element
  		* @returns Ext.util.Region A Region containing "top, left, bottom, right" member data.
  		*/
  var getViewRegion: js.UndefOr[js.Function0[IRegion]] = js.undefined
  /** [Method] Gets the current X position of the DOM element based on page coordinates
  		* @returns Number The X position of the element
  		*/
  var getX: js.UndefOr[js.Function0[Double]] = js.undefined
  /** [Method] Gets the current position of the DOM element based on page coordinates
  		* @returns Number[] The XY position of the element
  		*/
  var getXY: js.UndefOr[js.Function0[Array]] = js.undefined
  /** [Method] Gets the current Y position of the DOM element based on page coordinates
  		* @returns Number The Y position of the element
  		*/
  var getY: js.UndefOr[js.Function0[Double]] = js.undefined
  /** [Method] Move the element relative to its current position
  		* @param direction String Possible values are:  "l" (or "left") "r" (or "right") "t" (or "top", or "up") "b" (or "bottom", or "down")
  		* @param distance Number How far to move the element in pixels
  		* @param animate Boolean/Object true for the default animation or a standard Element animation config object
  		*/
  var move: js.UndefOr[
    js.Function3[
      /* direction */ js.UndefOr[String], 
      /* distance */ js.UndefOr[Double], 
      /* animate */ js.UndefOr[js.Any], 
      Unit
    ]
  ] = js.undefined
  /** [Method] Remove any anchor to this element
  		* @returns Ext.util.Positionable this
  		*/
  var removeAnchor: js.UndefOr[js.Function0[this.type]] = js.undefined
  /** [Method] Sets the element s box
  		* @param box Object The box to fill {x, y, width, height}
  		* @param animate Boolean/Object true for the default animation or a standard Element animation config object
  		* @returns Ext.util.Positionable this
  		*/
  var setBox: js.UndefOr[
    js.Function2[/* box */ js.UndefOr[js.Any], /* animate */ js.UndefOr[js.Any], this.type]
  ] = js.undefined
  /** [Method] Sets the local x coordinate of this element using CSS style
  		* @param x Number The x coordinate. A value of null sets the left style to 'auto'.
  		* @returns Ext.util.Positionable this
  		*/
  var setLocalX: js.UndefOr[js.Function1[/* x */ js.UndefOr[Double], this.type]] = js.undefined
  /** [Method] Sets the local x and y coordinates of this element using CSS style
  		* @param x Number/Array The x coordinate or an array containing [x, y]. A value of null sets the left style to 'auto'
  		* @param y Number The y coordinate, required if x is not an array. A value of null sets the top style to 'auto'
  		* @returns Ext.util.Positionable this
  		*/
  var setLocalXY: js.UndefOr[js.Function2[/* x */ js.UndefOr[js.Any], /* y */ js.UndefOr[Double], this.type]] = js.undefined
  /** [Method] Sets the local y coordinate of this element using CSS style
  		* @param y Number The y coordinate. A value of null sets the top style to 'auto'.
  		* @returns Ext.util.Positionable this
  		*/
  var setLocalY: js.UndefOr[js.Function1[/* y */ js.UndefOr[Double], this.type]] = js.undefined
  /** [Method] Sets the element s position and size to the specified region
  		* @param region Ext.util.Region The region to fill
  		* @param animate Boolean/Object true for the default animation or a standard Element animation config object
  		* @returns Ext.util.Positionable this
  		*/
  var setRegion: js.UndefOr[
    js.Function2[/* region */ js.UndefOr[IRegion], /* animate */ js.UndefOr[js.Any], this.type]
  ] = js.undefined
  /** [Method] Sets the X position of the DOM element based on page coordinates
  		* @param The Number X position
  		* @param animate Boolean/Object True for the default animation, or a standard Element animation config object
  		* @returns Ext.util.Positionable this
  		*/
  var setX: js.UndefOr[
    js.Function2[/* The */ js.UndefOr[Double], /* animate */ js.UndefOr[js.Any], this.type]
  ] = js.undefined
  /** [Method] Sets the position of the DOM element in page coordinates
  		* @param pos Number[] Contains X &amp; Y [x, y] values for new position (coordinates are page-based)
  		* @param animate Boolean/Object True for the default animation, or a standard Element animation config object
  		* @returns Ext.util.Positionable this
  		*/
  var setXY: js.UndefOr[
    js.Function2[/* pos */ js.UndefOr[Array], /* animate */ js.UndefOr[js.Any], this.type]
  ] = js.undefined
  /** [Method] Sets the Y position of the DOM element based on page coordinates
  		* @param The Number Y position
  		* @param animate Boolean/Object True for the default animation, or a standard Element animation config object
  		* @returns Ext.util.Positionable this
  		*/
  var setY: js.UndefOr[
    js.Function2[/* The */ js.UndefOr[Double], /* animate */ js.UndefOr[js.Any], this.type]
  ] = js.undefined
  /** [Method] Translates the passed page coordinates into left top css values for the element
  		* @param x Number/Array The page x or an array containing [x, y]
  		* @param y Number The page y, required if x is not an array
  		* @returns Object An object with left and top properties. e.g. {left: (value), top: (value)}
  		*/
  var translatePoints: js.UndefOr[js.Function2[/* x */ js.UndefOr[js.Any], /* y */ js.UndefOr[Double], _]] = js.undefined
}

object IPositionable {
  @scala.inline
  def apply(
    alias: Array = null,
    alignTo: (/* element */ js.UndefOr[js.Any], /* position */ js.UndefOr[String], /* offsets */ js.UndefOr[Array], /* animate */ js.UndefOr[js.Any]) => CallbackTo[IPositionable] = null,
    alternateClassName: js.Any = null,
    anchorTo: (/* element */ js.UndefOr[js.Any], /* position */ js.UndefOr[String], /* offsets */ js.UndefOr[Array], /* animate */ js.UndefOr[js.Any], /* monitorScroll */ js.UndefOr[js.Any], /* callback */ js.UndefOr[js.Any]) => CallbackTo[IPositionable] = null,
    calculateConstrainedPosition: (/* constrainTo */ js.UndefOr[js.Any], /* proposedPosition */ js.UndefOr[Array], /* local */ js.UndefOr[Boolean], /* proposedSize */ js.UndefOr[Array]) => CallbackTo[Array] = null,
    callOverridden: /* args */ js.UndefOr[js.Any] => CallbackTo[js.Any] = null,
    callParent: /* args */ js.UndefOr[js.Any] => CallbackTo[js.Any] = null,
    callSuper: /* args */ js.UndefOr[js.Any] => CallbackTo[js.Any] = null,
    config: js.Any = null,
    extend: String = null,
    getAlignToXY: (/* element */ js.UndefOr[js.Any], /* position */ js.UndefOr[String], /* offsets */ js.UndefOr[Array]) => CallbackTo[Array] = null,
    getAnchorXY: (/* anchor */ js.UndefOr[String], /* local */ js.UndefOr[Boolean], /* size */ js.UndefOr[js.Any]) => CallbackTo[Array] = null,
    getBox: (/* contentBox */ js.UndefOr[Boolean], /* local */ js.UndefOr[Boolean]) => CallbackTo[js.Any] = null,
    getConstrainVector: (/* constrainTo */ js.UndefOr[js.Any], /* proposedPosition */ js.UndefOr[Array], /* proposedSize */ js.UndefOr[Array]) => CallbackTo[js.Any] = null,
    getInitialConfig: /* name */ js.UndefOr[String] => CallbackTo[js.Any] = null,
    getLocalX: js.UndefOr[CallbackTo[Double]] = js.undefined,
    getLocalXY: js.UndefOr[CallbackTo[Array]] = js.undefined,
    getLocalY: js.UndefOr[CallbackTo[Double]] = js.undefined,
    getOffsetsTo: /* offsetsTo */ js.UndefOr[js.Any] => CallbackTo[Array] = null,
    getRegion: js.UndefOr[CallbackTo[IRegion]] = js.undefined,
    getViewRegion: js.UndefOr[CallbackTo[IRegion]] = js.undefined,
    getX: js.UndefOr[CallbackTo[Double]] = js.undefined,
    getXY: js.UndefOr[CallbackTo[Array]] = js.undefined,
    getY: js.UndefOr[CallbackTo[Double]] = js.undefined,
    inheritableStatics: js.Any = null,
    initConfig: /* config */ js.UndefOr[js.Any] => CallbackTo[IPositionable] = null,
    mixins: js.Any = null,
    move: (/* direction */ js.UndefOr[String], /* distance */ js.UndefOr[Double], /* animate */ js.UndefOr[js.Any]) => Callback = null,
    removeAnchor: js.UndefOr[CallbackTo[IPositionable]] = js.undefined,
    requires: Array = null,
    self: IClass = null,
    setBox: (/* box */ js.UndefOr[js.Any], /* animate */ js.UndefOr[js.Any]) => CallbackTo[IPositionable] = null,
    setLocalX: /* x */ js.UndefOr[Double] => CallbackTo[IPositionable] = null,
    setLocalXY: (/* x */ js.UndefOr[js.Any], /* y */ js.UndefOr[Double]) => CallbackTo[IPositionable] = null,
    setLocalY: /* y */ js.UndefOr[Double] => CallbackTo[IPositionable] = null,
    setRegion: (/* region */ js.UndefOr[IRegion], /* animate */ js.UndefOr[js.Any]) => CallbackTo[IPositionable] = null,
    setX: (/* The */ js.UndefOr[Double], /* animate */ js.UndefOr[js.Any]) => CallbackTo[IPositionable] = null,
    setXY: (/* pos */ js.UndefOr[Array], /* animate */ js.UndefOr[js.Any]) => CallbackTo[IPositionable] = null,
    setY: (/* The */ js.UndefOr[Double], /* animate */ js.UndefOr[js.Any]) => CallbackTo[IPositionable] = null,
    singleton: js.UndefOr[Boolean] = js.undefined,
    statics: js.Any = null,
    translatePoints: (/* x */ js.UndefOr[js.Any], /* y */ js.UndefOr[Double]) => CallbackTo[js.Any] = null,
    uses: Array = null
  ): IPositionable = {
    val __obj = js.Dynamic.literal()
    if (alias != null) __obj.updateDynamic("alias")(alias.asInstanceOf[js.Any])
    if (alignTo != null) __obj.updateDynamic("alignTo")(js.Any.fromFunction4((t0: /* element */ js.UndefOr[js.Any], t1: /* position */ js.UndefOr[java.lang.String], t2: /* offsets */ js.UndefOr[typingsJapgolly.extjs.Ext.Array], t3: /* animate */ js.UndefOr[js.Any]) => alignTo(t0, t1, t2, t3).runNow()))
    if (alternateClassName != null) __obj.updateDynamic("alternateClassName")(alternateClassName.asInstanceOf[js.Any])
    if (anchorTo != null) __obj.updateDynamic("anchorTo")(js.Any.fromFunction6((t0: /* element */ js.UndefOr[js.Any], t1: /* position */ js.UndefOr[java.lang.String], t2: /* offsets */ js.UndefOr[typingsJapgolly.extjs.Ext.Array], t3: /* animate */ js.UndefOr[js.Any], t4: /* monitorScroll */ js.UndefOr[js.Any], t5: /* callback */ js.UndefOr[js.Any]) => anchorTo(t0, t1, t2, t3, t4, t5).runNow()))
    if (calculateConstrainedPosition != null) __obj.updateDynamic("calculateConstrainedPosition")(js.Any.fromFunction4((t0: /* constrainTo */ js.UndefOr[js.Any], t1: /* proposedPosition */ js.UndefOr[typingsJapgolly.extjs.Ext.Array], t2: /* local */ js.UndefOr[scala.Boolean], t3: /* proposedSize */ js.UndefOr[typingsJapgolly.extjs.Ext.Array]) => calculateConstrainedPosition(t0, t1, t2, t3).runNow()))
    if (callOverridden != null) __obj.updateDynamic("callOverridden")(js.Any.fromFunction1((t0: /* args */ js.UndefOr[js.Any]) => callOverridden(t0).runNow()))
    if (callParent != null) __obj.updateDynamic("callParent")(js.Any.fromFunction1((t0: /* args */ js.UndefOr[js.Any]) => callParent(t0).runNow()))
    if (callSuper != null) __obj.updateDynamic("callSuper")(js.Any.fromFunction1((t0: /* args */ js.UndefOr[js.Any]) => callSuper(t0).runNow()))
    if (config != null) __obj.updateDynamic("config")(config.asInstanceOf[js.Any])
    if (extend != null) __obj.updateDynamic("extend")(extend.asInstanceOf[js.Any])
    if (getAlignToXY != null) __obj.updateDynamic("getAlignToXY")(js.Any.fromFunction3((t0: /* element */ js.UndefOr[js.Any], t1: /* position */ js.UndefOr[java.lang.String], t2: /* offsets */ js.UndefOr[typingsJapgolly.extjs.Ext.Array]) => getAlignToXY(t0, t1, t2).runNow()))
    if (getAnchorXY != null) __obj.updateDynamic("getAnchorXY")(js.Any.fromFunction3((t0: /* anchor */ js.UndefOr[java.lang.String], t1: /* local */ js.UndefOr[scala.Boolean], t2: /* size */ js.UndefOr[js.Any]) => getAnchorXY(t0, t1, t2).runNow()))
    if (getBox != null) __obj.updateDynamic("getBox")(js.Any.fromFunction2((t0: /* contentBox */ js.UndefOr[scala.Boolean], t1: /* local */ js.UndefOr[scala.Boolean]) => getBox(t0, t1).runNow()))
    if (getConstrainVector != null) __obj.updateDynamic("getConstrainVector")(js.Any.fromFunction3((t0: /* constrainTo */ js.UndefOr[js.Any], t1: /* proposedPosition */ js.UndefOr[typingsJapgolly.extjs.Ext.Array], t2: /* proposedSize */ js.UndefOr[typingsJapgolly.extjs.Ext.Array]) => getConstrainVector(t0, t1, t2).runNow()))
    if (getInitialConfig != null) __obj.updateDynamic("getInitialConfig")(js.Any.fromFunction1((t0: /* name */ js.UndefOr[java.lang.String]) => getInitialConfig(t0).runNow()))
    getLocalX.foreach(p => __obj.updateDynamic("getLocalX")(p.toJsFn))
    getLocalXY.foreach(p => __obj.updateDynamic("getLocalXY")(p.toJsFn))
    getLocalY.foreach(p => __obj.updateDynamic("getLocalY")(p.toJsFn))
    if (getOffsetsTo != null) __obj.updateDynamic("getOffsetsTo")(js.Any.fromFunction1((t0: /* offsetsTo */ js.UndefOr[js.Any]) => getOffsetsTo(t0).runNow()))
    getRegion.foreach(p => __obj.updateDynamic("getRegion")(p.toJsFn))
    getViewRegion.foreach(p => __obj.updateDynamic("getViewRegion")(p.toJsFn))
    getX.foreach(p => __obj.updateDynamic("getX")(p.toJsFn))
    getXY.foreach(p => __obj.updateDynamic("getXY")(p.toJsFn))
    getY.foreach(p => __obj.updateDynamic("getY")(p.toJsFn))
    if (inheritableStatics != null) __obj.updateDynamic("inheritableStatics")(inheritableStatics.asInstanceOf[js.Any])
    if (initConfig != null) __obj.updateDynamic("initConfig")(js.Any.fromFunction1((t0: /* config */ js.UndefOr[js.Any]) => initConfig(t0).runNow()))
    if (mixins != null) __obj.updateDynamic("mixins")(mixins.asInstanceOf[js.Any])
    if (move != null) __obj.updateDynamic("move")(js.Any.fromFunction3((t0: /* direction */ js.UndefOr[java.lang.String], t1: /* distance */ js.UndefOr[scala.Double], t2: /* animate */ js.UndefOr[js.Any]) => move(t0, t1, t2).runNow()))
    removeAnchor.foreach(p => __obj.updateDynamic("removeAnchor")(p.toJsFn))
    if (requires != null) __obj.updateDynamic("requires")(requires.asInstanceOf[js.Any])
    if (self != null) __obj.updateDynamic("self")(self.asInstanceOf[js.Any])
    if (setBox != null) __obj.updateDynamic("setBox")(js.Any.fromFunction2((t0: /* box */ js.UndefOr[js.Any], t1: /* animate */ js.UndefOr[js.Any]) => setBox(t0, t1).runNow()))
    if (setLocalX != null) __obj.updateDynamic("setLocalX")(js.Any.fromFunction1((t0: /* x */ js.UndefOr[scala.Double]) => setLocalX(t0).runNow()))
    if (setLocalXY != null) __obj.updateDynamic("setLocalXY")(js.Any.fromFunction2((t0: /* x */ js.UndefOr[js.Any], t1: /* y */ js.UndefOr[scala.Double]) => setLocalXY(t0, t1).runNow()))
    if (setLocalY != null) __obj.updateDynamic("setLocalY")(js.Any.fromFunction1((t0: /* y */ js.UndefOr[scala.Double]) => setLocalY(t0).runNow()))
    if (setRegion != null) __obj.updateDynamic("setRegion")(js.Any.fromFunction2((t0: /* region */ js.UndefOr[typingsJapgolly.extjs.Ext.util.IRegion], t1: /* animate */ js.UndefOr[js.Any]) => setRegion(t0, t1).runNow()))
    if (setX != null) __obj.updateDynamic("setX")(js.Any.fromFunction2((t0: /* The */ js.UndefOr[scala.Double], t1: /* animate */ js.UndefOr[js.Any]) => setX(t0, t1).runNow()))
    if (setXY != null) __obj.updateDynamic("setXY")(js.Any.fromFunction2((t0: /* pos */ js.UndefOr[typingsJapgolly.extjs.Ext.Array], t1: /* animate */ js.UndefOr[js.Any]) => setXY(t0, t1).runNow()))
    if (setY != null) __obj.updateDynamic("setY")(js.Any.fromFunction2((t0: /* The */ js.UndefOr[scala.Double], t1: /* animate */ js.UndefOr[js.Any]) => setY(t0, t1).runNow()))
    if (!js.isUndefined(singleton)) __obj.updateDynamic("singleton")(singleton.asInstanceOf[js.Any])
    if (statics != null) __obj.updateDynamic("statics")(statics.asInstanceOf[js.Any])
    if (translatePoints != null) __obj.updateDynamic("translatePoints")(js.Any.fromFunction2((t0: /* x */ js.UndefOr[js.Any], t1: /* y */ js.UndefOr[scala.Double]) => translatePoints(t0, t1).runNow()))
    if (uses != null) __obj.updateDynamic("uses")(uses.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPositionable]
  }
}

