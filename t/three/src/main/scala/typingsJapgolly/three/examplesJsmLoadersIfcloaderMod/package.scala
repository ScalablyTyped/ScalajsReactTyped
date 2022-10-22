package typingsJapgolly.three.examplesJsmLoadersIfcloaderMod

import org.scalablytyped.runtime.NumberDictionary
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.three.anon.Ids
import typingsJapgolly.three.examplesJsmLoadersIfcloaderMod.^
import typingsJapgolly.three.srcThreeMod.BufferAttribute
import typingsJapgolly.three.srcThreeMod.BufferGeometry
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def DEFAULT: /* "default" */ String = ^.asInstanceOf[js.Dynamic].selectDynamic("DEFAULT").asInstanceOf[/* "default" */ String]

inline def IdAttrName: /* "expressID" */ String = ^.asInstanceOf[js.Dynamic].selectDynamic("IdAttrName").asInstanceOf[/* "expressID" */ String]

inline def merge(geoms: js.Array[BufferGeometry]): BufferGeometry = ^.asInstanceOf[js.Dynamic].applyDynamic("merge")(geoms.asInstanceOf[js.Any]).asInstanceOf[BufferGeometry]
inline def merge(geoms: js.Array[BufferGeometry], createGroups: Boolean): BufferGeometry = (^.asInstanceOf[js.Dynamic].applyDynamic("merge")(geoms.asInstanceOf[js.Any], createGroups.asInstanceOf[js.Any])).asInstanceOf[BufferGeometry]

inline def newFloatAttr(data: js.Array[Any], size: Double): BufferAttribute = (^.asInstanceOf[js.Dynamic].applyDynamic("newFloatAttr")(data.asInstanceOf[js.Any], size.asInstanceOf[js.Any])).asInstanceOf[BufferAttribute]

inline def newIntAttr(data: js.Array[Any], size: Double): BufferAttribute = (^.asInstanceOf[js.Dynamic].applyDynamic("newIntAttr")(data.asInstanceOf[js.Any], size.asInstanceOf[js.Any])).asInstanceOf[BufferAttribute]

type GeometriesByMaterials = StringDictionary[GeometriesByMaterial]

type IdAttributeByMaterial = NumberDictionary[Double]

type IdAttributesByMaterials = StringDictionary[IdAttributeByMaterial]

type IdGeometries = NumberDictionary[BufferGeometry]

type MapFaceindexID = NumberDictionary[Double]

type SelectedItems = StringDictionary[Ids]

type TypesMap = NumberDictionary[Double]
