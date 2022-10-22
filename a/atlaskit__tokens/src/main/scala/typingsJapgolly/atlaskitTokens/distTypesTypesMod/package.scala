package typingsJapgolly.atlaskitTokens.distTypesTypesMod

import typingsJapgolly.atlaskitTokens.anon.Radius
import typingsJapgolly.atlaskitTokens.atlaskitTokensStrings.active
import typingsJapgolly.atlaskitTokens.atlaskitTokensStrings.attributes
import typingsJapgolly.atlaskitTokens.atlaskitTokensStrings.deleted
import typingsJapgolly.atlaskitTokens.atlaskitTokensStrings.deprecated
import typingsJapgolly.atlaskitTokens.atlaskitTokensStrings.opacity
import typingsJapgolly.atlaskitTokens.atlaskitTokensStrings.paint
import typingsJapgolly.atlaskitTokens.atlaskitTokensStrings.raw
import typingsJapgolly.atlaskitTokens.atlaskitTokensStrings.shadow
import typingsJapgolly.atlaskitTokens.atlaskitTokensStrings.value
import typingsJapgolly.atlaskitTokens.distTypesArtifactsTypesInternalMod.InternalTokenIds
import typingsJapgolly.std.Omit
import typingsJapgolly.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type ActiveTokenState = active

type AttributeSchema[Schema /* <: js.Object */] = DeepOmit[Schema, value]

type DeepOmit[T /* <: Any */, K /* <: PropertyKey */] = Omit[
/* import warning: importer.ImportType#apply Failed type conversion: {[ P in keyof T ]: @atlaskit/tokens.@atlaskit/tokens/dist/types/types.OmitDistributive<T[P], K>} */ js.Any, 
K]

type DeletedTokenState = deleted

type DeprecatedTokenState = deprecated

type Id[T] = js.Object & (/* import warning: importer.ImportType#apply Failed type conversion: {[ P in keyof T ]: T[P]} */ js.Any)

type OpacityToken = DesignToken[String, opacity]

type PaintToken[BaseToken] = DesignToken[BaseToken, paint]

type RawToken = DesignToken[String, raw]

type Replacement = InternalTokenIds | js.Array[InternalTokenIds]

type ShadowToken[BaseToken] = DesignToken[js.Array[Radius[BaseToken]], shadow]

type TokenSchema[BaseToken] = ColorTokenSchema[BaseToken] & ElevationTokenSchema[BaseToken]

type TokenState = ActiveTokenState | DeprecatedTokenState | DeletedTokenState

type ValueCategory = opacity

type ValueSchema[Schema /* <: js.Object */] = DeepOmit[Schema, attributes]
