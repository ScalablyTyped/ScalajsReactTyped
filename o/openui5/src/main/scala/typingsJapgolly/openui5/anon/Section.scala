package typingsJapgolly.openui5.anon

import typingsJapgolly.openui5.sapUxapObjectPageSectionMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Section extends StObject {
  
  /**
    * The section which the layout is scrolled to.
    */
  var section: js.UndefOr[default] = js.undefined
  
  /**
    * The subsection which the layout is scrolled to.
    */
  var subSection: js.UndefOr[typingsJapgolly.openui5.sapUxapObjectPageSubSectionMod.default] = js.undefined
}
object Section {
  
  inline def apply(): Section = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Section]
  }
  
  extension [Self <: Section](x: Self) {
    
    inline def setSection(value: default): Self = StObject.set(x, "section", value.asInstanceOf[js.Any])
    
    inline def setSectionUndefined: Self = StObject.set(x, "section", js.undefined)
    
    inline def setSubSection(value: typingsJapgolly.openui5.sapUxapObjectPageSubSectionMod.default): Self = StObject.set(x, "subSection", value.asInstanceOf[js.Any])
    
    inline def setSubSectionUndefined: Self = StObject.set(x, "subSection", js.undefined)
  }
}
