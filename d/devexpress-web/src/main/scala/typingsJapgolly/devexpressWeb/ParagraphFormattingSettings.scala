package typingsJapgolly.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Contains paragraph formatting settings.
  */
trait ParagraphFormattingSettings extends StObject {
  
  /**
    * Specifies the paragraph alignment.
    */
  var alignment: ParagraphAlignment
  
  /**
    * Specifies the paragraph background color.
    */
  var backColor: String
  
  /**
    * Specifies whether to remove an additional space (contextual spacing) between paragraphs of the same style.
    */
  var contextualSpacing: Boolean
  
  /**
    * Specifies the indent of the paragraph's first line.
    */
  var firstLineIndent: Double
  
  /**
    * Specifies whether and how the paragraph's first line is indented.
    */
  var firstLineIndentType: ParagraphFirstLineIndent
  
  /**
    * Specifies whether all lines in a paragraph should appear on the same page.
    */
  var keepLinesTogether: Boolean
  
  /**
    * Specifies the left indent for text in a paragraph.
    */
  var leftIndent: Double
  
  /**
    * Specifies a line spacing value.
    */
  var lineSpacing: Double
  
  /**
    * Specifies a spacing between lines in the paragraph.
    */
  var lineSpacingType: ParagraphLineSpacingType
  
  /**
    * Specifies the paragraph's outline level.
    */
  var outlineLevel: Double
  
  /**
    * Specifies whether a page break is inserted before the paragraph.
    */
  var pageBreakBefore: Boolean
  
  /**
    * Specifies the paragraph's right indent.
    */
  var rightIndent: Double
  
  /**
    * Specifies the spacing after the paragraph.
    */
  var spacingAfter: Double
  
  /**
    * Specifies the spacing before the paragraph.
    */
  var spacingBefore: Double
}
object ParagraphFormattingSettings {
  
  inline def apply(
    alignment: ParagraphAlignment,
    backColor: String,
    contextualSpacing: Boolean,
    firstLineIndent: Double,
    firstLineIndentType: ParagraphFirstLineIndent,
    keepLinesTogether: Boolean,
    leftIndent: Double,
    lineSpacing: Double,
    lineSpacingType: ParagraphLineSpacingType,
    outlineLevel: Double,
    pageBreakBefore: Boolean,
    rightIndent: Double,
    spacingAfter: Double,
    spacingBefore: Double
  ): ParagraphFormattingSettings = {
    val __obj = js.Dynamic.literal(alignment = alignment.asInstanceOf[js.Any], backColor = backColor.asInstanceOf[js.Any], contextualSpacing = contextualSpacing.asInstanceOf[js.Any], firstLineIndent = firstLineIndent.asInstanceOf[js.Any], firstLineIndentType = firstLineIndentType.asInstanceOf[js.Any], keepLinesTogether = keepLinesTogether.asInstanceOf[js.Any], leftIndent = leftIndent.asInstanceOf[js.Any], lineSpacing = lineSpacing.asInstanceOf[js.Any], lineSpacingType = lineSpacingType.asInstanceOf[js.Any], outlineLevel = outlineLevel.asInstanceOf[js.Any], pageBreakBefore = pageBreakBefore.asInstanceOf[js.Any], rightIndent = rightIndent.asInstanceOf[js.Any], spacingAfter = spacingAfter.asInstanceOf[js.Any], spacingBefore = spacingBefore.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParagraphFormattingSettings]
  }
  
  extension [Self <: ParagraphFormattingSettings](x: Self) {
    
    inline def setAlignment(value: ParagraphAlignment): Self = StObject.set(x, "alignment", value.asInstanceOf[js.Any])
    
    inline def setBackColor(value: String): Self = StObject.set(x, "backColor", value.asInstanceOf[js.Any])
    
    inline def setContextualSpacing(value: Boolean): Self = StObject.set(x, "contextualSpacing", value.asInstanceOf[js.Any])
    
    inline def setFirstLineIndent(value: Double): Self = StObject.set(x, "firstLineIndent", value.asInstanceOf[js.Any])
    
    inline def setFirstLineIndentType(value: ParagraphFirstLineIndent): Self = StObject.set(x, "firstLineIndentType", value.asInstanceOf[js.Any])
    
    inline def setKeepLinesTogether(value: Boolean): Self = StObject.set(x, "keepLinesTogether", value.asInstanceOf[js.Any])
    
    inline def setLeftIndent(value: Double): Self = StObject.set(x, "leftIndent", value.asInstanceOf[js.Any])
    
    inline def setLineSpacing(value: Double): Self = StObject.set(x, "lineSpacing", value.asInstanceOf[js.Any])
    
    inline def setLineSpacingType(value: ParagraphLineSpacingType): Self = StObject.set(x, "lineSpacingType", value.asInstanceOf[js.Any])
    
    inline def setOutlineLevel(value: Double): Self = StObject.set(x, "outlineLevel", value.asInstanceOf[js.Any])
    
    inline def setPageBreakBefore(value: Boolean): Self = StObject.set(x, "pageBreakBefore", value.asInstanceOf[js.Any])
    
    inline def setRightIndent(value: Double): Self = StObject.set(x, "rightIndent", value.asInstanceOf[js.Any])
    
    inline def setSpacingAfter(value: Double): Self = StObject.set(x, "spacingAfter", value.asInstanceOf[js.Any])
    
    inline def setSpacingBefore(value: Double): Self = StObject.set(x, "spacingBefore", value.asInstanceOf[js.Any])
  }
}
