package typingsJapgolly.materialUiStyles

import typingsJapgolly.materialUiStyles.materialUiStylesStrings.withTheme
import typingsJapgolly.materialUiStyles.withStylesWithStylesMod.Styles
import typingsJapgolly.materialUiStyles.withStylesWithStylesMod.WithStylesOptions
import typingsJapgolly.materialUiTypes.mod.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object makeStylesMakeStylesMod {
  
  @JSImport("@material-ui/styles/makeStyles/makeStyles", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[Theme, Props /* <: js.Object */, ClassKey /* <: String */](styles: Styles[Theme, Props, ClassKey]): /* import warning: importer.ImportType#apply Failed type conversion: keyof Props extends never ? (props : any | undefined): @material-ui/styles.@material-ui/styles/withStyles/withStyles.ClassNameMap<ClassKey> : (props : Props): @material-ui/styles.@material-ui/styles/withStyles/withStyles.ClassNameMap<ClassKey> */ js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(styles.asInstanceOf[js.Any]).asInstanceOf[/* import warning: importer.ImportType#apply Failed type conversion: keyof Props extends never ? (props : any | undefined): @material-ui/styles.@material-ui/styles/withStyles/withStyles.ClassNameMap<ClassKey> : (props : Props): @material-ui/styles.@material-ui/styles/withStyles/withStyles.ClassNameMap<ClassKey> */ js.Any]
  
  inline def default_withTheme[Theme, Props /* <: js.Object */, ClassKey /* <: String */](styles: Styles[Theme, Props, ClassKey], options: Omit[WithStylesOptions[Theme], withTheme]): /* import warning: importer.ImportType#apply Failed type conversion: keyof Props extends never ? (props : any | undefined): @material-ui/styles.@material-ui/styles/withStyles/withStyles.ClassNameMap<ClassKey> : (props : Props): @material-ui/styles.@material-ui/styles/withStyles/withStyles.ClassNameMap<ClassKey> */ js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(styles.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[/* import warning: importer.ImportType#apply Failed type conversion: keyof Props extends never ? (props : any | undefined): @material-ui/styles.@material-ui/styles/withStyles/withStyles.ClassNameMap<ClassKey> : (props : Props): @material-ui/styles.@material-ui/styles/withStyles/withStyles.ClassNameMap<ClassKey> */ js.Any]
}
