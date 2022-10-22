package typingsJapgolly.webicon

import typingsJapgolly.webicon.iconOptionsImageIconOptionsMod.ImageIconOptions
import typingsJapgolly.webicon.iconOptionsSizeableOptionsMod.SizeableOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object iconOptionsSvgIconOptionsMod {
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typingsJapgolly.webicon.iconSizeableMod.Sizeable because Already inherited
  - typingsJapgolly.webicon.iconIconMod.Icon because Already inherited
  - typingsJapgolly.webicon.iconSvgIconMod.SvgIcon because var conflicts: iconIdParser, iconSize. Inlined viewBox */ trait SvgIconOptions
    extends StObject
       with ImageIconOptions
       with SizeableOptions {
    
    /**
      * The default viewBox of the icon.
      */
    var viewBox: js.UndefOr[String] = js.undefined
  }
  object SvgIconOptions {
    
    inline def apply(): SvgIconOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SvgIconOptions]
    }
    
    extension [Self <: SvgIconOptions](x: Self) {
      
      inline def setViewBox(value: String): Self = StObject.set(x, "viewBox", value.asInstanceOf[js.Any])
      
      inline def setViewBoxUndefined: Self = StObject.set(x, "viewBox", js.undefined)
    }
  }
}
