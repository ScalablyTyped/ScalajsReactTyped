package typingsJapgolly.fluentuiStyleUtilities

import typingsJapgolly.fluentuiTheme.libTypesIschemeMod.ISchemeNames
import typingsJapgolly.fluentuiTheme.libTypesIthemeMod.ITheme
import typingsJapgolly.fluentuiUtilities.libCustomizationsCustomizerContextMod.ICustomizerContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libStylesSchemeMod {
  
  @JSImport("@fluentui/style-utilities/lib/styles/scheme", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getThemedContext(context: ICustomizerContext): ICustomizerContext = ^.asInstanceOf[js.Dynamic].applyDynamic("getThemedContext")(context.asInstanceOf[js.Any]).asInstanceOf[ICustomizerContext]
  inline def getThemedContext(context: ICustomizerContext, scheme: Unit, theme: ITheme): ICustomizerContext = (^.asInstanceOf[js.Dynamic].applyDynamic("getThemedContext")(context.asInstanceOf[js.Any], scheme.asInstanceOf[js.Any], theme.asInstanceOf[js.Any])).asInstanceOf[ICustomizerContext]
  inline def getThemedContext(context: ICustomizerContext, scheme: ISchemeNames): ICustomizerContext = (^.asInstanceOf[js.Dynamic].applyDynamic("getThemedContext")(context.asInstanceOf[js.Any], scheme.asInstanceOf[js.Any])).asInstanceOf[ICustomizerContext]
  inline def getThemedContext(context: ICustomizerContext, scheme: ISchemeNames, theme: ITheme): ICustomizerContext = (^.asInstanceOf[js.Dynamic].applyDynamic("getThemedContext")(context.asInstanceOf[js.Any], scheme.asInstanceOf[js.Any], theme.asInstanceOf[js.Any])).asInstanceOf[ICustomizerContext]
}
