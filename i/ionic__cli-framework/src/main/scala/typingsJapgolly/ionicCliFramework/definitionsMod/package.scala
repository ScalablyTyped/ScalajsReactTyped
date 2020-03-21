package typingsJapgolly.ionicCliFramework

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object definitionsMod {
  type CommandLineInputs = js.Array[java.lang.String]
  type CommandMapGetter[C /* <: typingsJapgolly.ionicCliFramework.definitionsMod.ICommand[C, N, M, I, O] */, N /* <: typingsJapgolly.ionicCliFramework.definitionsMod.INamespace[C, N, M, I, O] */, M /* <: typingsJapgolly.ionicCliFramework.definitionsMod.CommandMetadata[I, O] */, I /* <: typingsJapgolly.ionicCliFramework.definitionsMod.CommandMetadataInput */, O /* <: typingsJapgolly.ionicCliFramework.definitionsMod.CommandMetadataOption */] = js.Function0[js.Promise[C]]
  type CommandOptionType = typingsJapgolly.std.StringConstructor | typingsJapgolly.std.BooleanConstructor
  type CommandPathItem[C /* <: typingsJapgolly.ionicCliFramework.definitionsMod.ICommand[C, N, M, I, O] */, N /* <: typingsJapgolly.ionicCliFramework.definitionsMod.INamespace[C, N, M, I, O] */, M /* <: typingsJapgolly.ionicCliFramework.definitionsMod.CommandMetadata[I, O] */, I /* <: typingsJapgolly.ionicCliFramework.definitionsMod.CommandMetadataInput */, O /* <: typingsJapgolly.ionicCliFramework.definitionsMod.CommandMetadataOption */] = js.Tuple2[java.lang.String, C | N]
  type HydratedCommandMetadata[C /* <: typingsJapgolly.ionicCliFramework.definitionsMod.ICommand[C, N, M, I, O] */, N /* <: typingsJapgolly.ionicCliFramework.definitionsMod.INamespace[C, N, M, I, O] */, M /* <: typingsJapgolly.ionicCliFramework.definitionsMod.CommandMetadata[I, O] */, I /* <: typingsJapgolly.ionicCliFramework.definitionsMod.CommandMetadataInput */, O /* <: typingsJapgolly.ionicCliFramework.definitionsMod.CommandMetadataOption */] = M with (typingsJapgolly.ionicCliFramework.AnonAliases[C, N, M, I, O])
  type HydratedCommandMetadataOption[O /* <: typingsJapgolly.ionicCliFramework.definitionsMod.CommandMetadataOption */] = typingsJapgolly.std.Required[O]
  type ICommandMap[C /* <: typingsJapgolly.ionicCliFramework.definitionsMod.ICommand[C, N, M, I, O] */, N /* <: typingsJapgolly.ionicCliFramework.definitionsMod.INamespace[C, N, M, I, O] */, M /* <: typingsJapgolly.ionicCliFramework.definitionsMod.CommandMetadata[I, O] */, I /* <: typingsJapgolly.ionicCliFramework.definitionsMod.CommandMetadataInput */, O /* <: typingsJapgolly.ionicCliFramework.definitionsMod.CommandMetadataOption */] = typingsJapgolly.ionicUtilsObject.mod.AliasedMap[
    java.lang.String, 
    typingsJapgolly.ionicCliFramework.definitionsMod.CommandMapGetter[C, N, M, I, O]
  ]
  type INamespaceMap[C /* <: typingsJapgolly.ionicCliFramework.definitionsMod.ICommand[C, N, M, I, O] */, N /* <: typingsJapgolly.ionicCliFramework.definitionsMod.INamespace[C, N, M, I, O] */, M /* <: typingsJapgolly.ionicCliFramework.definitionsMod.CommandMetadata[I, O] */, I /* <: typingsJapgolly.ionicCliFramework.definitionsMod.CommandMetadataInput */, O /* <: typingsJapgolly.ionicCliFramework.definitionsMod.CommandMetadataOption */] = typingsJapgolly.ionicUtilsObject.mod.AliasedMap[
    java.lang.String, 
    typingsJapgolly.ionicCliFramework.definitionsMod.NamespaceMapGetter[C, N, M, I, O]
  ]
  type NamespaceMapGetter[C /* <: typingsJapgolly.ionicCliFramework.definitionsMod.ICommand[C, N, M, I, O] */, N /* <: typingsJapgolly.ionicCliFramework.definitionsMod.INamespace[C, N, M, I, O] */, M /* <: typingsJapgolly.ionicCliFramework.definitionsMod.CommandMetadata[I, O] */, I /* <: typingsJapgolly.ionicCliFramework.definitionsMod.CommandMetadataInput */, O /* <: typingsJapgolly.ionicCliFramework.definitionsMod.CommandMetadataOption */] = js.Function0[js.Promise[N]]
  type NamespaceMetadata = typingsJapgolly.ionicCliFramework.definitionsMod.Metadata
  type ParsedArg = js.UndefOr[java.lang.String | scala.Boolean | scala.Null | js.Array[java.lang.String]]
  type Validator = js.Function2[
    /* input */ js.UndefOr[java.lang.String], 
    /* key */ js.UndefOr[java.lang.String], 
    typingsJapgolly.ionicCliFramework.ionicCliFrameworkBooleans.`true` | java.lang.String
  ]
}
