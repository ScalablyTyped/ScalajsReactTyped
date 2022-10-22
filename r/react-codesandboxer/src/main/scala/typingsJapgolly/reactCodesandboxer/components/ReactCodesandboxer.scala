package typingsJapgolly.reactCodesandboxer.components

import japgolly.scalajs.react.facade.React.Node
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reactCodesandboxer.anon.Files
import typingsJapgolly.reactCodesandboxer.anon.IsLoading
import typingsJapgolly.reactCodesandboxer.mod.Error
import typingsJapgolly.reactCodesandboxer.mod.GitInfo
import typingsJapgolly.reactCodesandboxer.mod.ImportReplacement
import typingsJapgolly.reactCodesandboxer.mod.Package
import typingsJapgolly.reactCodesandboxer.mod.Props
import typingsJapgolly.reactCodesandboxer.mod.default
import typingsJapgolly.reactCodesandboxer.reactCodesandboxerStrings.`create-react-app-typescript`
import typingsJapgolly.reactCodesandboxer.reactCodesandboxerStrings.`create-react-app`
import typingsJapgolly.reactCodesandboxer.reactCodesandboxerStrings.`vue-cli`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ReactCodesandboxer {
  
  inline def apply(children: IsLoading => Node, examplePath: String, gitInfo: GitInfo): Builder = {
    val __props = js.Dynamic.literal(children = js.Any.fromFunction1(children), examplePath = examplePath.asInstanceOf[js.Any], gitInfo = gitInfo.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[Props]))
  }
  
  @JSImport("react-codesandboxer", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[default] {
    
    inline def afterDeploy(value: (/* sandboxUrl */ String, /* sandboxId */ String) => Any): this.type = set("afterDeploy", js.Any.fromFunction2(value))
    
    inline def afterDeployError(value: /* error */ Error => Any): this.type = set("afterDeployError", js.Any.fromFunction1(value))
    
    inline def autoDeploy(value: Boolean): this.type = set("autoDeploy", value.asInstanceOf[js.Any])
    
    inline def example(value: String | js.Promise[String]): this.type = set("example", value.asInstanceOf[js.Any])
    
    inline def extensions(value: js.Array[String]): this.type = set("extensions", value.asInstanceOf[js.Any])
    
    inline def extensionsVarargs(value: String*): this.type = set("extensions", js.Array(value*))
    
    inline def ignoreInternalImports(value: Boolean): this.type = set("ignoreInternalImports", value.asInstanceOf[js.Any])
    
    inline def importReplacements(value: js.Array[ImportReplacement]): this.type = set("importReplacements", value.asInstanceOf[js.Any])
    
    inline def importReplacementsVarargs(value: ImportReplacement*): this.type = set("importReplacements", js.Array(value*))
    
    inline def name(value: String): this.type = set("name", value.asInstanceOf[js.Any])
    
    inline def onLoadComplete(value: /* arg */ Files | typingsJapgolly.reactCodesandboxer.anon.Error => Any): this.type = set("onLoadComplete", js.Any.fromFunction1(value))
    
    inline def pkgJSON(value: Package | String | (js.Promise[Package | String])): this.type = set("pkgJSON", value.asInstanceOf[js.Any])
    
    inline def preload(value: Boolean): this.type = set("preload", value.asInstanceOf[js.Any])
    
    inline def providedFiles(value: typingsJapgolly.reactCodesandboxer.mod.Files): this.type = set("providedFiles", value.asInstanceOf[js.Any])
    
    inline def skipRedirect(value: Boolean): this.type = set("skipRedirect", value.asInstanceOf[js.Any])
    
    inline def style(value: js.Object): this.type = set("style", value.asInstanceOf[js.Any])
    
    inline def template(value: `create-react-app` | `create-react-app-typescript` | `vue-cli`): this.type = set("template", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: Props): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
