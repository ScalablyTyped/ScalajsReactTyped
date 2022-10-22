package typingsJapgolly.scriptableIos

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * _Cell in a UITableRow._
  * @see https://docs.scriptable.app/uitablecell
  */
trait UITableCell extends StObject {
  
  /**
    * _Center aligns content._
    *
    * Specifies that content in the cell should be center aligned.
    * @see https://docs.scriptable.app/uitablecell/#-centeraligned
    */
  def centerAligned(): Unit
  
  /**
    * _Whether to dismiss the table when the button is tapped._
    *
    * Defaults to false.
    * @see https://docs.scriptable.app/uitablecell/#dismissontap
    */
  var dismissOnTap: Boolean
  
  /**
    * _Left aligns content._
    *
    * Specifies that content in the cell should be left aligned.
    * @see https://docs.scriptable.app/uitablecell/#-leftaligned
    */
  def leftAligned(): Unit
  
  /**
    * _Called when the button is tapped._
    *
    * Buttons cannot be tapped when the table is presented in Siri.
    * @see https://docs.scriptable.app/uitablecell/#ontap
    */
  def onTap(): Unit
  
  /**
    * _Right aligns content._
    *
    * Specifies that content in the cell should be right aligned.
    * @see https://docs.scriptable.app/uitablecell/#-rightaligned
    */
  def rightAligned(): Unit
  
  /**
    * _Color of the subtitle._
    *
    * This only has an effect on cells with a subtitle. By default the color is null, in which case an appropriate color is automatically chosen based on the theme of the app and the
    * context the script is running in.
    * @see https://docs.scriptable.app/uitablecell/#subtitlecolor
    */
  var subtitleColor: Color
  
  /**
    * _Font of the subtitle._
    * @see https://docs.scriptable.app/uitablecell/#subtitlefont
    */
  var subtitleFont: Font
  
  /**
    * _Color of the title._
    *
    * This only has an effect on cells with a title. By default the color is null, in which case an appropriate color is automatically chosen based on the theme of the app and the
    * context the script is running in.
    * @see https://docs.scriptable.app/uitablecell/#titlecolor
    */
  var titleColor: Color
  
  /**
    * _Font of the title._
    * @see https://docs.scriptable.app/uitablecell/#titlefont
    */
  var titleFont: Font
  
  /**
    * _Relative width of the cell._
    *
    * A width weight specifies the relative width of the cell. When computing the absolute width of the cell, all width weights are taken into account. Consider the following example.
    *
    * Cell A has a width weight of 50. Cell B has a width weight of 100. Cell C has a width wegiht of 150.
    *
    * Assume that the row has an absolute width of 100. The width will be distributed among cells A, B and C. B will be double as wide as A but C will be fifty percent wider than B and
    * three times as wide as A.
    * @see https://docs.scriptable.app/uitablecell/#widthweight
    */
  var widthWeight: Double
}
object UITableCell {
  
  inline def apply(
    centerAligned: Callback,
    dismissOnTap: Boolean,
    leftAligned: Callback,
    onTap: Callback,
    rightAligned: Callback,
    subtitleColor: Color,
    subtitleFont: Font,
    titleColor: Color,
    titleFont: Font,
    widthWeight: Double
  ): UITableCell = {
    val __obj = js.Dynamic.literal(centerAligned = centerAligned.toJsFn, dismissOnTap = dismissOnTap.asInstanceOf[js.Any], leftAligned = leftAligned.toJsFn, onTap = onTap.toJsFn, rightAligned = rightAligned.toJsFn, subtitleColor = subtitleColor.asInstanceOf[js.Any], subtitleFont = subtitleFont.asInstanceOf[js.Any], titleColor = titleColor.asInstanceOf[js.Any], titleFont = titleFont.asInstanceOf[js.Any], widthWeight = widthWeight.asInstanceOf[js.Any])
    __obj.asInstanceOf[UITableCell]
  }
  
  extension [Self <: UITableCell](x: Self) {
    
    inline def setCenterAligned(value: Callback): Self = StObject.set(x, "centerAligned", value.toJsFn)
    
    inline def setDismissOnTap(value: Boolean): Self = StObject.set(x, "dismissOnTap", value.asInstanceOf[js.Any])
    
    inline def setLeftAligned(value: Callback): Self = StObject.set(x, "leftAligned", value.toJsFn)
    
    inline def setOnTap(value: Callback): Self = StObject.set(x, "onTap", value.toJsFn)
    
    inline def setRightAligned(value: Callback): Self = StObject.set(x, "rightAligned", value.toJsFn)
    
    inline def setSubtitleColor(value: Color): Self = StObject.set(x, "subtitleColor", value.asInstanceOf[js.Any])
    
    inline def setSubtitleFont(value: Font): Self = StObject.set(x, "subtitleFont", value.asInstanceOf[js.Any])
    
    inline def setTitleColor(value: Color): Self = StObject.set(x, "titleColor", value.asInstanceOf[js.Any])
    
    inline def setTitleFont(value: Font): Self = StObject.set(x, "titleFont", value.asInstanceOf[js.Any])
    
    inline def setWidthWeight(value: Double): Self = StObject.set(x, "widthWeight", value.asInstanceOf[js.Any])
  }
}
