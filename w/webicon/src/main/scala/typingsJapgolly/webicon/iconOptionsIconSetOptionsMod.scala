package typingsJapgolly.webicon

import typingsJapgolly.webicon.iconSvgIconMod.SvgIcon
import typingsJapgolly.webicon.webUrlConfigMod.UrlConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object iconOptionsIconSetOptionsMod {
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typingsJapgolly.webicon.iconIconMod.Icon because Already inherited
  - typingsJapgolly.webicon.iconSizeableMod.Sizeable because Already inherited
  - typingsJapgolly.webicon.iconOptionsDownloadableMod.Downloadable because var conflicts: iconIdParser. Inlined url, uri
  - typingsJapgolly.webicon.iconOptionsSizeableOptionsMod.SizeableOptions because var conflicts: iconSize. Inlined size, svgIconSize */ trait IconSetOptions
    extends StObject
       with SvgIcon {
    
    /**
      * A value indicating whether the icons are loaded separately.
      */
    var cumulative: js.UndefOr[Boolean] = js.undefined
    
    /**
      * An alias of the `iconSize`-property.
      */
    var size: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: this['iconSize'] */ js.Any
      ] = js.undefined
    
    /**
      * An alias of the `iconSize`-property.
      */
    var svgIconSize: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: this['iconSize'] */ js.Any
      ] = js.undefined
    
    /**
      * An alias of the `url`-property.
      */
    var uri: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: this['url'] */ js.Any
      ] = js.undefined
    
    /**
      * The url to load the source from.
      */
    var url: js.UndefOr[UrlConfig[scala.Nothing]] = js.undefined
  }
  object IconSetOptions {
    
    inline def apply(): IconSetOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IconSetOptions]
    }
    
    extension [Self <: IconSetOptions](x: Self) {
      
      inline def setCumulative(value: Boolean): Self = StObject.set(x, "cumulative", value.asInstanceOf[js.Any])
      
      inline def setCumulativeUndefined: Self = StObject.set(x, "cumulative", js.undefined)
      
      inline def setSize(
        value: /* import warning: importer.ImportType#apply Failed type conversion: this['iconSize'] */ js.Any
      ): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      inline def setSvgIconSize(
        value: /* import warning: importer.ImportType#apply Failed type conversion: this['iconSize'] */ js.Any
      ): Self = StObject.set(x, "svgIconSize", value.asInstanceOf[js.Any])
      
      inline def setSvgIconSizeUndefined: Self = StObject.set(x, "svgIconSize", js.undefined)
      
      inline def setUri(value: /* import warning: importer.ImportType#apply Failed type conversion: this['url'] */ js.Any): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
      
      inline def setUriUndefined: Self = StObject.set(x, "uri", js.undefined)
      
      inline def setUrl(value: UrlConfig[scala.Nothing]): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    }
  }
}
