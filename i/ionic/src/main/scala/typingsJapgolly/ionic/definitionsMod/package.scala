package typingsJapgolly.ionic.definitionsMod

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.ionic.anon.Images
import typingsJapgolly.ionic.anon.Req
import typingsJapgolly.ionic.ionicStrings.`ssl-commands`
import typingsJapgolly.ionic.ionicStrings.custom
import typingsJapgolly.ionic.ionicStrings.ionic1
import typingsJapgolly.ionicCliFramework.definitionsMod.CommandMetadataInput
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type APIResponseData = js.Object | js.Array[js.Object] | String

type CommandInstanceInfo = typingsJapgolly.ionicCliFramework.definitionsMod.CommandInstanceInfo[ICommand, INamespace, CommandMetadata, CommandMetadataInput, CommandMetadataOption]

type CustomBuildOptions = BuildOptions[custom]

type CustomServeOptions = ServeOptions

type FeatureId = `ssl-commands`

type HookContext = BaseHookContext & HookInput

type HookFn = js.Function1[/* ctx */ HookContext, js.Promise[Unit]]

type HydratedCommandMetadata = CommandMetadata & (typingsJapgolly.ionicCliFramework.definitionsMod.HydratedCommandMetadata[ICommand, INamespace, CommandMetadata, CommandMetadataInput, CommandMetadataOption])

type Ionic1BuildOptions = BuildOptions[ionic1]

type LogFn = js.Function1[/* msg */ String, Unit]

type NamespaceLocateResult = typingsJapgolly.ionicCliFramework.definitionsMod.NamespaceLocateResult[ICommand, INamespace, CommandMetadata, CommandMetadataInput, CommandMetadataOption]

type PackageVersions = StringDictionary[String]

type PaginatorGuard[T /* <: Response[js.Array[js.Object]] */] = js.Function1[/* res */ APIResponseSuccess, /* is T */ Boolean]

type PaginatorRequestGenerator = js.Function0[js.Promise[Req]]

type ResourcesConfig = StringDictionary[ResourcesPlatform]

type ResourcesPlatform = StringDictionary[Images]

type SuperAgentRequest = typingsJapgolly.superagent.mod.SuperAgentRequest
