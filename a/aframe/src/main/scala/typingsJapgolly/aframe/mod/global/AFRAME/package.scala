package typingsJapgolly.aframe.mod.global.AFRAME

import typingsJapgolly.aframe.mod.AnimeLib
import typingsJapgolly.aframe.mod.Component
import typingsJapgolly.aframe.mod.ComponentConstructor
import typingsJapgolly.aframe.mod.ComponentDefinition
import typingsJapgolly.aframe.mod.ComponentDescriptor
import typingsJapgolly.aframe.mod.Entity
import typingsJapgolly.aframe.mod.Geometry
import typingsJapgolly.aframe.mod.GeometryConstructor
import typingsJapgolly.aframe.mod.GeometryDefinition
import typingsJapgolly.aframe.mod.GeometryDescriptor
import typingsJapgolly.aframe.mod.MinimalShaderDefinition
import typingsJapgolly.aframe.mod.ObjectMap
import typingsJapgolly.aframe.mod.PrimitiveDefinition
import typingsJapgolly.aframe.mod.Scene
import typingsJapgolly.aframe.mod.SchemaUtils
import typingsJapgolly.aframe.mod.Shader
import typingsJapgolly.aframe.mod.ShaderConstructor
import typingsJapgolly.aframe.mod.ShaderDefinition
import typingsJapgolly.aframe.mod.ShaderDescriptor
import typingsJapgolly.aframe.mod.System
import typingsJapgolly.aframe.mod.SystemConstructor
import typingsJapgolly.aframe.mod.SystemDefinition
import typingsJapgolly.aframe.mod.Utils_
import typingsJapgolly.aframe.mod.global.AFRAME.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def AComponent: Component[Any, System[Any]] = ^.asInstanceOf[js.Dynamic].selectDynamic("AComponent").asInstanceOf[Component[Any, System[Any]]]

inline def AEntity: Entity[ObjectMap[Component[Any, System[Any]]]] = ^.asInstanceOf[js.Dynamic].selectDynamic("AEntity").asInstanceOf[Entity[ObjectMap[Component[Any, System[Any]]]]]

inline def ANIME: AnimeLib = ^.asInstanceOf[js.Dynamic].selectDynamic("ANIME").asInstanceOf[AnimeLib]

inline def ANode: typingsJapgolly.aframe.mod.ANode = ^.asInstanceOf[js.Dynamic].selectDynamic("ANode").asInstanceOf[typingsJapgolly.aframe.mod.ANode]

inline def AScene: Scene = ^.asInstanceOf[js.Dynamic].selectDynamic("AScene").asInstanceOf[Scene]

inline def components: ObjectMap[ComponentDescriptor[Component[Any, System[Any]]]] = ^.asInstanceOf[js.Dynamic].selectDynamic("components").asInstanceOf[ObjectMap[ComponentDescriptor[Component[Any, System[Any]]]]]

inline def geometries: ObjectMap[GeometryDescriptor[Geometry[Any]]] = ^.asInstanceOf[js.Dynamic].selectDynamic("geometries").asInstanceOf[ObjectMap[GeometryDescriptor[Geometry[Any]]]]

inline def registerComponent: js.Function2[
/* name */ String, 
/* component */ ComponentDefinition[js.Object], 
ComponentConstructor[js.Object]] = ^.asInstanceOf[js.Dynamic].selectDynamic("registerComponent").asInstanceOf[js.Function2[
/* name */ String, 
/* component */ ComponentDefinition[js.Object], 
ComponentConstructor[js.Object]]]

inline def registerElement: js.Function2[/* name */ String, /* element */ js.Object, Unit] = ^.asInstanceOf[js.Dynamic].selectDynamic("registerElement").asInstanceOf[js.Function2[/* name */ String, /* element */ js.Object, Unit]]

inline def registerGeometry: js.Function2[
/* name */ String, 
/* geometry */ GeometryDefinition[js.Object, Any], 
GeometryConstructor[js.Object]] = ^.asInstanceOf[js.Dynamic].selectDynamic("registerGeometry").asInstanceOf[js.Function2[
/* name */ String, 
/* geometry */ GeometryDefinition[js.Object, Any], 
GeometryConstructor[js.Object]]]

inline def registerPrimitive: js.Function2[/* name */ String, /* primitive */ PrimitiveDefinition, Unit] = ^.asInstanceOf[js.Dynamic].selectDynamic("registerPrimitive").asInstanceOf[js.Function2[/* name */ String, /* primitive */ PrimitiveDefinition, Unit]]

inline def registerShader: js.Function2[
/* name */ String, 
/* shader */ ShaderDefinition[MinimalShaderDefinition & js.Object], 
ShaderConstructor[MinimalShaderDefinition & js.Object]] = ^.asInstanceOf[js.Dynamic].selectDynamic("registerShader").asInstanceOf[js.Function2[
/* name */ String, 
/* shader */ ShaderDefinition[MinimalShaderDefinition & js.Object], 
ShaderConstructor[MinimalShaderDefinition & js.Object]]]

inline def registerSystem: js.Function2[
/* name */ String, 
/* definition */ SystemDefinition[js.Object], 
SystemConstructor[js.Object]] = ^.asInstanceOf[js.Dynamic].selectDynamic("registerSystem").asInstanceOf[js.Function2[
/* name */ String, 
/* definition */ SystemDefinition[js.Object], 
SystemConstructor[js.Object]]]

inline def scenes: js.Array[Scene] = ^.asInstanceOf[js.Dynamic].selectDynamic("scenes").asInstanceOf[js.Array[Scene]]

inline def schema: SchemaUtils = ^.asInstanceOf[js.Dynamic].selectDynamic("schema").asInstanceOf[SchemaUtils]

inline def shaders: ObjectMap[ShaderDescriptor[Shader]] = ^.asInstanceOf[js.Dynamic].selectDynamic("shaders").asInstanceOf[ObjectMap[ShaderDescriptor[Shader]]]

inline def systems: ObjectMap[SystemConstructor[js.Object]] = ^.asInstanceOf[js.Dynamic].selectDynamic("systems").asInstanceOf[ObjectMap[SystemConstructor[js.Object]]]

inline def utils: Utils_ = ^.asInstanceOf[js.Dynamic].selectDynamic("utils").asInstanceOf[Utils_]

inline def version: String = ^.asInstanceOf[js.Dynamic].selectDynamic("version").asInstanceOf[String]
