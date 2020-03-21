package typingsJapgolly.ionic

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object definitionsMod {
  type APIResponseData = js.Object | js.Array[js.Object] | java.lang.String
  type CommandInstanceInfo = typingsJapgolly.ionicCliFramework.definitionsMod.CommandInstanceInfo[
    typingsJapgolly.ionic.definitionsMod.ICommand, 
    typingsJapgolly.ionic.definitionsMod.INamespace, 
    typingsJapgolly.ionic.definitionsMod.CommandMetadata, 
    typingsJapgolly.ionicCliFramework.definitionsMod.CommandMetadataInput, 
    typingsJapgolly.ionic.definitionsMod.CommandMetadataOption
  ]
  type CustomBuildOptions = typingsJapgolly.ionic.definitionsMod.BuildOptions[typingsJapgolly.ionic.ionicStrings.custom]
  type CustomServeOptions = typingsJapgolly.ionic.definitionsMod.ServeOptions
  type FeatureId = typingsJapgolly.ionic.ionicStrings.`ssl-commands`
  type HookContext = typingsJapgolly.ionic.definitionsMod.BaseHookContext with typingsJapgolly.ionic.definitionsMod.HookInput
  type HookFn = js.Function1[/* ctx */ typingsJapgolly.ionic.definitionsMod.HookContext, js.Promise[scala.Unit]]
  type HydratedCommandMetadata = typingsJapgolly.ionic.definitionsMod.CommandMetadata with (typingsJapgolly.ionicCliFramework.definitionsMod.HydratedCommandMetadata[
    typingsJapgolly.ionic.definitionsMod.ICommand, 
    typingsJapgolly.ionic.definitionsMod.INamespace, 
    typingsJapgolly.ionic.definitionsMod.CommandMetadata, 
    typingsJapgolly.ionicCliFramework.definitionsMod.CommandMetadataInput, 
    typingsJapgolly.ionic.definitionsMod.CommandMetadataOption
  ])
  type Ionic1BuildOptions = typingsJapgolly.ionic.definitionsMod.BuildOptions[typingsJapgolly.ionic.ionicStrings.ionic1]
  type LogFn = js.Function1[/* msg */ java.lang.String, scala.Unit]
  type NamespaceLocateResult = typingsJapgolly.ionicCliFramework.definitionsMod.NamespaceLocateResult[
    typingsJapgolly.ionic.definitionsMod.ICommand, 
    typingsJapgolly.ionic.definitionsMod.INamespace, 
    typingsJapgolly.ionic.definitionsMod.CommandMetadata, 
    typingsJapgolly.ionicCliFramework.definitionsMod.CommandMetadataInput, 
    typingsJapgolly.ionic.definitionsMod.CommandMetadataOption
  ]
  type PackageVersions = org.scalablytyped.runtime.StringDictionary[java.lang.String]
  type PaginatorGuard[T /* <: typingsJapgolly.ionic.definitionsMod.Response[js.Array[js.Object]] */] = js.Function1[
    /* res */ typingsJapgolly.ionic.definitionsMod.APIResponseSuccess, 
    /* is T */ scala.Boolean
  ]
  type PaginatorRequestGenerator = js.Function0[js.Promise[typingsJapgolly.ionic.AnonReq]]
  type ResourcesConfig = org.scalablytyped.runtime.StringDictionary[typingsJapgolly.ionic.definitionsMod.ResourcesPlatform]
  type ResourcesPlatform = org.scalablytyped.runtime.StringDictionary[typingsJapgolly.ionic.AnonImages]
  type SuperAgentRequest = typingsJapgolly.superagent.mod.SuperAgentRequest
}
