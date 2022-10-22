package typingsJapgolly.storybookCoreCommon.anon

import typingsJapgolly.storybookCoreCommon.storybookCoreCommonBooleans.`false`
import typingsJapgolly.storybookCoreCommon.storybookCoreCommonStrings.`react-docgen-typescript`
import typingsJapgolly.storybookCoreCommon.storybookCoreCommonStrings.`react-docgen`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@storybook/core-common.@storybook/core-common/dist/ts3.9/types.TypescriptOptions> */
trait PartialTypescriptOptions extends StObject {
  
  var check: js.UndefOr[Boolean] = js.undefined
  
  var checkOptions: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: fork-ts-checker-webpack-plugin.fork-ts-checker-webpack-plugin/lib/plugin.ForkTsCheckerWebpackPlugin['options'] */ js.Any
  ] = js.undefined
  
  var reactDocgen: js.UndefOr[`react-docgen-typescript` | `react-docgen` | `false`] = js.undefined
  
  var reactDocgenTypescriptOptions: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PluginOptions */ Any
  ] = js.undefined
}
object PartialTypescriptOptions {
  
  inline def apply(): PartialTypescriptOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialTypescriptOptions]
  }
  
  extension [Self <: PartialTypescriptOptions](x: Self) {
    
    inline def setCheck(value: Boolean): Self = StObject.set(x, "check", value.asInstanceOf[js.Any])
    
    inline def setCheckOptions(
      value: /* import warning: importer.ImportType#apply Failed type conversion: fork-ts-checker-webpack-plugin.fork-ts-checker-webpack-plugin/lib/plugin.ForkTsCheckerWebpackPlugin['options'] */ js.Any
    ): Self = StObject.set(x, "checkOptions", value.asInstanceOf[js.Any])
    
    inline def setCheckOptionsUndefined: Self = StObject.set(x, "checkOptions", js.undefined)
    
    inline def setCheckUndefined: Self = StObject.set(x, "check", js.undefined)
    
    inline def setReactDocgen(value: `react-docgen-typescript` | `react-docgen` | `false`): Self = StObject.set(x, "reactDocgen", value.asInstanceOf[js.Any])
    
    inline def setReactDocgenTypescriptOptions(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PluginOptions */ Any
    ): Self = StObject.set(x, "reactDocgenTypescriptOptions", value.asInstanceOf[js.Any])
    
    inline def setReactDocgenTypescriptOptionsUndefined: Self = StObject.set(x, "reactDocgenTypescriptOptions", js.undefined)
    
    inline def setReactDocgenUndefined: Self = StObject.set(x, "reactDocgen", js.undefined)
  }
}
