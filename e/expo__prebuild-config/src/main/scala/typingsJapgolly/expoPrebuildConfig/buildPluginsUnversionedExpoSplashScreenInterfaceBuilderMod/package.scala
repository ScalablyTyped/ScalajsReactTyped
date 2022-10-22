package typingsJapgolly.expoPrebuildConfig.buildPluginsUnversionedExpoSplashScreenInterfaceBuilderMod

import typingsJapgolly.expoPrebuildConfig.anon.ImageName
import typingsJapgolly.expoPrebuildConfig.anon.ImageNameString
import typingsJapgolly.expoPrebuildConfig.anon._empty
import typingsJapgolly.expoPrebuildConfig.anon.`0`
import typingsJapgolly.expoPrebuildConfig.buildPluginsUnversionedExpoSplashScreenInterfaceBuilderMod.^
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def applyImageToSplashScreenXML(xml: IBSplashScreenDocument, hasImageNameContentMode: ImageName): IBSplashScreenDocument = (^.asInstanceOf[js.Dynamic].applyDynamic("applyImageToSplashScreenXML")(xml.asInstanceOf[js.Any], hasImageNameContentMode.asInstanceOf[js.Any])).asInstanceOf[IBSplashScreenDocument]

inline def createConstraint(
  hasFirstItemFirstAttribute: js.Tuple2[String, ConstraintAttribute],
  hasSecondItemSecondAttribute: js.Tuple2[String, ConstraintAttribute]
): IBConstraint = (^.asInstanceOf[js.Dynamic].applyDynamic("createConstraint")(hasFirstItemFirstAttribute.asInstanceOf[js.Any], hasSecondItemSecondAttribute.asInstanceOf[js.Any])).asInstanceOf[IBConstraint]
inline def createConstraint(
  hasFirstItemFirstAttribute: js.Tuple2[String, ConstraintAttribute],
  hasSecondItemSecondAttribute: js.Tuple2[String, ConstraintAttribute],
  constant: Double
): IBConstraint = (^.asInstanceOf[js.Dynamic].applyDynamic("createConstraint")(hasFirstItemFirstAttribute.asInstanceOf[js.Any], hasSecondItemSecondAttribute.asInstanceOf[js.Any], constant.asInstanceOf[js.Any])).asInstanceOf[IBConstraint]

inline def createConstraintId(attributes: String*): String = ^.asInstanceOf[js.Dynamic].applyDynamic("createConstraintId")(attributes.asInstanceOf[Seq[js.Any]]*).asInstanceOf[String]

inline def ensureUniquePush[TItem /* <: `0` */](array: js.Array[TItem], item: TItem): js.Array[TItem] = (^.asInstanceOf[js.Dynamic].applyDynamic("ensureUniquePush")(array.asInstanceOf[js.Any], item.asInstanceOf[js.Any])).asInstanceOf[js.Array[TItem]]

inline def removeExisting[TItem /* <: `0` */](array: js.Array[TItem], item: TItem): js.Array[TItem] = (^.asInstanceOf[js.Dynamic].applyDynamic("removeExisting")(array.asInstanceOf[js.Any], item.asInstanceOf[js.Any])).asInstanceOf[js.Array[TItem]]
inline def removeExisting[TItem /* <: `0` */](array: js.Array[TItem], item: String): js.Array[TItem] = (^.asInstanceOf[js.Dynamic].applyDynamic("removeExisting")(array.asInstanceOf[js.Any], item.asInstanceOf[js.Any])).asInstanceOf[js.Array[TItem]]

inline def removeImageFromSplashScreen(xml: IBSplashScreenDocument, hasImageName: ImageNameString): IBSplashScreenDocument = (^.asInstanceOf[js.Dynamic].applyDynamic("removeImageFromSplashScreen")(xml.asInstanceOf[js.Any], hasImageName.asInstanceOf[js.Any])).asInstanceOf[IBSplashScreenDocument]

inline def toObjectAsync(contents: String): js.Promise[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObjectAsync")(contents.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Any]]

inline def toString_(xml: Any): String = ^.asInstanceOf[js.Dynamic].applyDynamic("toString")(xml.asInstanceOf[js.Any]).asInstanceOf[String]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.expoPrebuildConfig.expoPrebuildConfigStrings.YES
  - typingsJapgolly.expoPrebuildConfig.expoPrebuildConfigStrings.NO
  - scala.Boolean
*/
type IBBoolean = _IBBoolean | Boolean

/* Rewritten from type alias, can be one of: 
  - java.lang.String
  - typingsJapgolly.expoPrebuildConfig.expoPrebuildConfigStrings.left
  - typingsJapgolly.expoPrebuildConfig.expoPrebuildConfigStrings.scaleAspectFill
*/
type IBContentMode = _IBContentMode | String

type IBItem[H /* <: Record[String, Any] */, B /* <: Record[String, js.Array[Any]] */] = _empty[H] & B
