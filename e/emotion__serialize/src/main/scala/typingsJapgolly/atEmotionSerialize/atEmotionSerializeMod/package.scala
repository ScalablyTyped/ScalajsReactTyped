package typingsJapgolly.atEmotionSerialize

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object atEmotionSerializeMod {
  import typingsJapgolly.atEmotionSerialize.Anon_Anim
  import typingsJapgolly.atEmotionSerialize.typesHelperMod.Equal
  import typingsJapgolly.atEmotionUtils.atEmotionUtilsMod.SerializedStyles
  import typingsJapgolly.csstype.csstypeMod.PropertiesFallback

  /* Rewritten from type alias, can be one of: 
    - scala.Null
    - `js.undefined`
    - scala.Nothing
    - scala.Boolean
    - scala.Double
    - java.lang.String
    - typings.atEmotionSerialize.atEmotionSerializeMod.ComponentSelector
    - typings.atEmotionSerialize.atEmotionSerializeMod.Keyframes
    - typings.atEmotionUtils.atEmotionUtilsMod.SerializedStyles
    - typings.atEmotionSerialize.atEmotionSerializeMod.CSSObject
    - typings.atEmotionSerialize.atEmotionSerializeMod.ArrayCSSInterpolation
  */
  type CSSInterpolation = js.UndefOr[
    _CSSInterpolation | Null | Boolean | Double | String | Keyframes | SerializedStyles
  ]
  type CSSProperties = PropertiesFallback[Double | String]
  type CSSPropertiesWithMultiValues = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof @emotion/serialize.@emotion/serialize.CSSProperties ]: @emotion/serialize.@emotion/serialize.CSSProperties[K] | std.Array<std.Extract<@emotion/serialize.@emotion/serialize.CSSProperties[K], string>>}
    */ typingsJapgolly.atEmotionSerialize.atEmotionSerializeStrings.CSSPropertiesWithMultiValues with js.Any
  type CSSPseudos[MP] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in csstype.csstype.Pseudos ]:? @emotion/serialize.@emotion/serialize.ObjectInterpolation<MP>}
    */ typingsJapgolly.atEmotionSerialize.atEmotionSerializeStrings.CSSPseudos with js.Any
  type CSSPseudosForCSSObject = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in csstype.csstype.Pseudos ]:? @emotion/serialize.@emotion/serialize.CSSObject}
    */ typingsJapgolly.atEmotionSerialize.atEmotionSerializeStrings.CSSPseudosForCSSObject with js.Any
  /* Rewritten from type alias, can be one of: 
    - scala.Null
    - `js.undefined`
    - scala.Nothing
    - scala.Boolean
    - scala.Double
    - java.lang.String
    - typings.atEmotionSerialize.atEmotionSerializeMod.ComponentSelector
    - typings.atEmotionSerialize.atEmotionSerializeMod.Keyframes
    - typings.atEmotionUtils.atEmotionUtilsMod.SerializedStyles
    - typings.atEmotionSerialize.atEmotionSerializeMod.ArrayInterpolation[MP]
    - typings.atEmotionSerialize.atEmotionSerializeMod.ObjectInterpolation[MP]
    - typings.atEmotionSerialize.typesHelperMod.Equal[
  MP, 
  js.UndefOr[scala.Nothing], 
  scala.Nothing, 
  typings.atEmotionSerialize.atEmotionSerializeMod.FunctionInterpolation[MP]]
  */
  type Interpolation[MP] = js.UndefOr[
    _Interpolation[MP] | (Equal[MP, js.UndefOr[scala.Nothing], scala.Nothing, FunctionInterpolation[MP]]) | Null | Boolean | Double | String | Keyframes | SerializedStyles
  ]
  type Keyframes = Anon_Anim with String
}
