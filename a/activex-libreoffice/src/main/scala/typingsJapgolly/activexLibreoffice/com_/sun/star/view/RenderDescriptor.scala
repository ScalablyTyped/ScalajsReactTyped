package typingsJapgolly.activexLibreoffice.com_.sun.star.view

import typingsJapgolly.activexLibreoffice.com_.sun.star.awt.Size
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * describes the options for Render jobs.
  * @since OOo 1.1.2
  */
trait RenderDescriptor extends StObject {
  
  /** specifies the page size for the current renderer. The unit of this page size is 1/100th mm. */
  var PageSize: Size
}
object RenderDescriptor {
  
  inline def apply(PageSize: Size): RenderDescriptor = {
    val __obj = js.Dynamic.literal(PageSize = PageSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[RenderDescriptor]
  }
  
  extension [Self <: RenderDescriptor](x: Self) {
    
    inline def setPageSize(value: Size): Self = StObject.set(x, "PageSize", value.asInstanceOf[js.Any])
  }
}
