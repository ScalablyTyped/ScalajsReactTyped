package typingsJapgolly.babylonjs.meshesIndexMod

import typingsJapgolly.babylonjs.anon.AdjustFrame
import typingsJapgolly.babylonjs.anon.AlignHorizontal
import typingsJapgolly.babylonjs.anon.AlignVertical
import typingsJapgolly.babylonjs.anon.AlphaFilter
import typingsJapgolly.babylonjs.anon.Angle
import typingsJapgolly.babylonjs.anon.Arc
import typingsJapgolly.babylonjs.anon.BackUVs
import typingsJapgolly.babylonjs.anon.BottomBaseAt
import typingsJapgolly.babylonjs.anon.Buffer
import typingsJapgolly.babylonjs.anon.Cap
import typingsJapgolly.babylonjs.anon.Clip
import typingsJapgolly.babylonjs.anon.CloseArray
import typingsJapgolly.babylonjs.anon.ClosePath
import typingsJapgolly.babylonjs.anon.CloseShape
import typingsJapgolly.babylonjs.anon.Colors
import typingsJapgolly.babylonjs.anon.Custom
import typingsJapgolly.babylonjs.anon.DashNb
import typingsJapgolly.babylonjs.anon.DashSize
import typingsJapgolly.babylonjs.anon.DedupTopBottomIndices
import typingsJapgolly.babylonjs.anon.Depth
import typingsJapgolly.babylonjs.anon.Diameter
import typingsJapgolly.babylonjs.anon.DiameterX
import typingsJapgolly.babylonjs.anon.FaceColors
import typingsJapgolly.babylonjs.anon.FaceUV
import typingsJapgolly.babylonjs.anon.Flat
import typingsJapgolly.babylonjs.anon.FrontUVs
import typingsJapgolly.babylonjs.anon.Holes
import typingsJapgolly.babylonjs.anon.Instance
import typingsJapgolly.babylonjs.anon.InvertUV
import typingsJapgolly.babylonjs.anon.Lines
import typingsJapgolly.babylonjs.anon.P
import typingsJapgolly.babylonjs.anon.Pattern
import typingsJapgolly.babylonjs.anon.Precision
import typingsJapgolly.babylonjs.anon.Q
import typingsJapgolly.babylonjs.anon.Radius
import typingsJapgolly.babylonjs.anon.RadiusX
import typingsJapgolly.babylonjs.anon.SideOrientation
import typingsJapgolly.babylonjs.anon.Size
import typingsJapgolly.babylonjs.anon.Subdivisions
import typingsJapgolly.babylonjs.anon.SubdivisionsX
import typingsJapgolly.babylonjs.anon.Tessellation
import typingsJapgolly.babylonjs.anon.Thickness
import typingsJapgolly.babylonjs.anon.TileHeight
import typingsJapgolly.babylonjs.anon.Xmax
import typingsJapgolly.babylonjs.mathsMathDotcolorMod.Color4
import typingsJapgolly.babylonjs.mathsMathDotvectorMod.Vector4
import typingsJapgolly.babylonjs.meshesBuildersCapsuleBuilderMod.ICreateCapsuleOptions
import typingsJapgolly.babylonjs.meshesBuildersGoldbergBuilderMod.GoldbergCreationOption
import typingsJapgolly.babylonjs.meshesBuildersGoldbergBuilderMod.GoldbergVertexDataOption
import typingsJapgolly.babylonjs.meshesIndexMod.^
import typingsJapgolly.babylonjs.meshesMeshMod.Mesh
import typingsJapgolly.babylonjs.sceneMod.Scene
import typingsJapgolly.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def CreateBox(name: String): Mesh = ^.asInstanceOf[js.Dynamic].applyDynamic("CreateBox")(name.asInstanceOf[js.Any]).asInstanceOf[Mesh]
inline def CreateBox(name: String, options: Unit, scene: Nullable[Scene]): Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateBox")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any], scene.asInstanceOf[js.Any])).asInstanceOf[Mesh]
inline def CreateBox(name: String, options: BackUVs): Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateBox")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Mesh]
inline def CreateBox(name: String, options: BackUVs, scene: Nullable[Scene]): Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateBox")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any], scene.asInstanceOf[js.Any])).asInstanceOf[Mesh]

inline def CreateBoxVertexData(options: BottomBaseAt): typingsJapgolly.babylonjs.meshesMeshDotvertexDataMod.VertexData = ^.asInstanceOf[js.Dynamic].applyDynamic("CreateBoxVertexData")(options.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.babylonjs.meshesMeshDotvertexDataMod.VertexData]

inline def CreateCapsule(name: String): Mesh = ^.asInstanceOf[js.Dynamic].applyDynamic("CreateCapsule")(name.asInstanceOf[js.Any]).asInstanceOf[Mesh]
inline def CreateCapsule(name: String, options: Unit, scene: Nullable[Scene]): Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateCapsule")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any], scene.asInstanceOf[js.Any])).asInstanceOf[Mesh]
inline def CreateCapsule(name: String, options: ICreateCapsuleOptions): Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateCapsule")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Mesh]
inline def CreateCapsule(name: String, options: ICreateCapsuleOptions, scene: Nullable[Scene]): Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateCapsule")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any], scene.asInstanceOf[js.Any])).asInstanceOf[Mesh]

inline def CreateCapsuleVertexData(): typingsJapgolly.babylonjs.meshesMeshDotvertexDataMod.VertexData = ^.asInstanceOf[js.Dynamic].applyDynamic("CreateCapsuleVertexData")().asInstanceOf[typingsJapgolly.babylonjs.meshesMeshDotvertexDataMod.VertexData]
inline def CreateCapsuleVertexData(options: ICreateCapsuleOptions): typingsJapgolly.babylonjs.meshesMeshDotvertexDataMod.VertexData = ^.asInstanceOf[js.Dynamic].applyDynamic("CreateCapsuleVertexData")(options.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.babylonjs.meshesMeshDotvertexDataMod.VertexData]

inline def CreateCylinder(name: String): Mesh = ^.asInstanceOf[js.Dynamic].applyDynamic("CreateCylinder")(name.asInstanceOf[js.Any]).asInstanceOf[Mesh]
inline def CreateCylinder(name: String, options: Unit, scene: Nullable[Scene]): Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateCylinder")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any], scene.asInstanceOf[js.Any])).asInstanceOf[Mesh]
inline def CreateCylinder(name: String, options: Arc): Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateCylinder")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Mesh]
inline def CreateCylinder(name: String, options: Arc, scene: Nullable[Scene]): Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateCylinder")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any], scene.asInstanceOf[js.Any])).asInstanceOf[Mesh]

inline def CreateCylinderVertexData(options: Cap): typingsJapgolly.babylonjs.meshesMeshDotvertexDataMod.VertexData = ^.asInstanceOf[js.Dynamic].applyDynamic("CreateCylinderVertexData")(options.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.babylonjs.meshesMeshDotvertexDataMod.VertexData]

inline def CreateDashedLines(name: String, options: DashNb): typingsJapgolly.babylonjs.meshesLinesMeshMod.LinesMesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateDashedLines")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.babylonjs.meshesLinesMeshMod.LinesMesh]
inline def CreateDashedLines(name: String, options: DashNb, scene: Nullable[Scene]): typingsJapgolly.babylonjs.meshesLinesMeshMod.LinesMesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateDashedLines")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any], scene.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.babylonjs.meshesLinesMeshMod.LinesMesh]

inline def CreateDashedLinesVertexData(options: DashSize): typingsJapgolly.babylonjs.meshesMeshDotvertexDataMod.VertexData = ^.asInstanceOf[js.Dynamic].applyDynamic("CreateDashedLinesVertexData")(options.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.babylonjs.meshesMeshDotvertexDataMod.VertexData]

inline def CreateDecal(
  name: String,
  sourceMesh: typingsJapgolly.babylonjs.meshesAbstractMeshMod.AbstractMesh,
  options: Angle
): Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateDecal")(name.asInstanceOf[js.Any], sourceMesh.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Mesh]

inline def CreateDisc(name: String): Mesh = ^.asInstanceOf[js.Dynamic].applyDynamic("CreateDisc")(name.asInstanceOf[js.Any]).asInstanceOf[Mesh]
inline def CreateDisc(name: String, options: Unit, scene: Nullable[Scene]): Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateDisc")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any], scene.asInstanceOf[js.Any])).asInstanceOf[Mesh]
inline def CreateDisc(name: String, options: FrontUVs): Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateDisc")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Mesh]
inline def CreateDisc(name: String, options: FrontUVs, scene: Nullable[Scene]): Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateDisc")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any], scene.asInstanceOf[js.Any])).asInstanceOf[Mesh]

inline def CreateDiscVertexData(options: Radius): typingsJapgolly.babylonjs.meshesMeshDotvertexDataMod.VertexData = ^.asInstanceOf[js.Dynamic].applyDynamic("CreateDiscVertexData")(options.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.babylonjs.meshesMeshDotvertexDataMod.VertexData]

inline def CreateGeodesic(name: String, options: FaceColors): Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateGeodesic")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Mesh]
inline def CreateGeodesic(name: String, options: FaceColors, scene: Nullable[Scene]): Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateGeodesic")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any], scene.asInstanceOf[js.Any])).asInstanceOf[Mesh]

inline def CreateGoldberg(name: String, options: GoldbergCreationOption): typingsJapgolly.babylonjs.meshesGoldbergMeshMod.GoldbergMesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateGoldberg")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.babylonjs.meshesGoldbergMeshMod.GoldbergMesh]
inline def CreateGoldberg(name: String, options: GoldbergCreationOption, scene: Nullable[Scene]): typingsJapgolly.babylonjs.meshesGoldbergMeshMod.GoldbergMesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateGoldberg")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any], scene.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.babylonjs.meshesGoldbergMeshMod.GoldbergMesh]

inline def CreateGoldbergVertexData(
  options: GoldbergVertexDataOption,
  goldbergData: typingsJapgolly.babylonjs.meshesGeodesicMeshMod.PolyhedronData
): typingsJapgolly.babylonjs.meshesMeshDotvertexDataMod.VertexData = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateGoldbergVertexData")(options.asInstanceOf[js.Any], goldbergData.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.babylonjs.meshesMeshDotvertexDataMod.VertexData]

inline def CreateGround(name: String): typingsJapgolly.babylonjs.meshesGroundMeshMod.GroundMesh = ^.asInstanceOf[js.Dynamic].applyDynamic("CreateGround")(name.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.babylonjs.meshesGroundMeshMod.GroundMesh]
inline def CreateGround(name: String, options: Unit, scene: Scene): typingsJapgolly.babylonjs.meshesGroundMeshMod.GroundMesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateGround")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any], scene.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.babylonjs.meshesGroundMeshMod.GroundMesh]
inline def CreateGround(name: String, options: Subdivisions): typingsJapgolly.babylonjs.meshesGroundMeshMod.GroundMesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateGround")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.babylonjs.meshesGroundMeshMod.GroundMesh]
inline def CreateGround(name: String, options: Subdivisions, scene: Scene): typingsJapgolly.babylonjs.meshesGroundMeshMod.GroundMesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateGround")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any], scene.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.babylonjs.meshesGroundMeshMod.GroundMesh]

inline def CreateGroundFromHeightMap(name: String, url: String): typingsJapgolly.babylonjs.meshesGroundMeshMod.GroundMesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateGroundFromHeightMap")(name.asInstanceOf[js.Any], url.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.babylonjs.meshesGroundMeshMod.GroundMesh]
inline def CreateGroundFromHeightMap(name: String, url: String, options: Unit, scene: Nullable[Scene]): typingsJapgolly.babylonjs.meshesGroundMeshMod.GroundMesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateGroundFromHeightMap")(name.asInstanceOf[js.Any], url.asInstanceOf[js.Any], options.asInstanceOf[js.Any], scene.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.babylonjs.meshesGroundMeshMod.GroundMesh]
inline def CreateGroundFromHeightMap(name: String, url: String, options: AlphaFilter): typingsJapgolly.babylonjs.meshesGroundMeshMod.GroundMesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateGroundFromHeightMap")(name.asInstanceOf[js.Any], url.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.babylonjs.meshesGroundMeshMod.GroundMesh]
inline def CreateGroundFromHeightMap(name: String, url: String, options: AlphaFilter, scene: Nullable[Scene]): typingsJapgolly.babylonjs.meshesGroundMeshMod.GroundMesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateGroundFromHeightMap")(name.asInstanceOf[js.Any], url.asInstanceOf[js.Any], options.asInstanceOf[js.Any], scene.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.babylonjs.meshesGroundMeshMod.GroundMesh]

inline def CreateGroundFromHeightMapVertexData(options: Buffer): typingsJapgolly.babylonjs.meshesMeshDotvertexDataMod.VertexData = ^.asInstanceOf[js.Dynamic].applyDynamic("CreateGroundFromHeightMapVertexData")(options.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.babylonjs.meshesMeshDotvertexDataMod.VertexData]

inline def CreateGroundVertexData(options: SubdivisionsX): typingsJapgolly.babylonjs.meshesMeshDotvertexDataMod.VertexData = ^.asInstanceOf[js.Dynamic].applyDynamic("CreateGroundVertexData")(options.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.babylonjs.meshesMeshDotvertexDataMod.VertexData]

inline def CreateHemisphere(name: String): Mesh = ^.asInstanceOf[js.Dynamic].applyDynamic("CreateHemisphere")(name.asInstanceOf[js.Any]).asInstanceOf[Mesh]
inline def CreateHemisphere(name: String, options: Unit, scene: Scene): Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateHemisphere")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any], scene.asInstanceOf[js.Any])).asInstanceOf[Mesh]
inline def CreateHemisphere(name: String, options: Diameter): Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateHemisphere")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Mesh]
inline def CreateHemisphere(name: String, options: Diameter, scene: Scene): Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateHemisphere")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any], scene.asInstanceOf[js.Any])).asInstanceOf[Mesh]

inline def CreateIcoSphere(name: String): Mesh = ^.asInstanceOf[js.Dynamic].applyDynamic("CreateIcoSphere")(name.asInstanceOf[js.Any]).asInstanceOf[Mesh]
inline def CreateIcoSphere(name: String, options: Unit, scene: Nullable[Scene]): Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateIcoSphere")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any], scene.asInstanceOf[js.Any])).asInstanceOf[Mesh]
inline def CreateIcoSphere(name: String, options: Flat): Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateIcoSphere")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Mesh]
inline def CreateIcoSphere(name: String, options: Flat, scene: Nullable[Scene]): Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateIcoSphere")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any], scene.asInstanceOf[js.Any])).asInstanceOf[Mesh]

inline def CreateIcoSphereVertexData(options: RadiusX): typingsJapgolly.babylonjs.meshesMeshDotvertexDataMod.VertexData = ^.asInstanceOf[js.Dynamic].applyDynamic("CreateIcoSphereVertexData")(options.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.babylonjs.meshesMeshDotvertexDataMod.VertexData]

inline def CreateLathe(name: String, options: Clip): Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateLathe")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Mesh]
inline def CreateLathe(name: String, options: Clip, scene: Nullable[Scene]): Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateLathe")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any], scene.asInstanceOf[js.Any])).asInstanceOf[Mesh]

inline def CreateLineSystem(name: String, options: Colors, scene: Nullable[Scene]): typingsJapgolly.babylonjs.meshesLinesMeshMod.LinesMesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateLineSystem")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any], scene.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.babylonjs.meshesLinesMeshMod.LinesMesh]

inline def CreateLineSystemVertexData(options: Lines): typingsJapgolly.babylonjs.meshesMeshDotvertexDataMod.VertexData = ^.asInstanceOf[js.Dynamic].applyDynamic("CreateLineSystemVertexData")(options.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.babylonjs.meshesMeshDotvertexDataMod.VertexData]

inline def CreateLines(name: String, options: Instance): typingsJapgolly.babylonjs.meshesLinesMeshMod.LinesMesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateLines")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.babylonjs.meshesLinesMeshMod.LinesMesh]
inline def CreateLines(name: String, options: Instance, scene: Nullable[Scene]): typingsJapgolly.babylonjs.meshesLinesMeshMod.LinesMesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateLines")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any], scene.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.babylonjs.meshesLinesMeshMod.LinesMesh]

inline def CreatePlane(name: String): Mesh = ^.asInstanceOf[js.Dynamic].applyDynamic("CreatePlane")(name.asInstanceOf[js.Any]).asInstanceOf[Mesh]
inline def CreatePlane(name: String, options: Unit, scene: Nullable[Scene]): Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreatePlane")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any], scene.asInstanceOf[js.Any])).asInstanceOf[Mesh]
inline def CreatePlane(name: String, options: SideOrientation): Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreatePlane")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Mesh]
inline def CreatePlane(name: String, options: SideOrientation, scene: Nullable[Scene]): Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreatePlane")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any], scene.asInstanceOf[js.Any])).asInstanceOf[Mesh]

inline def CreatePlaneVertexData(options: Size): typingsJapgolly.babylonjs.meshesMeshDotvertexDataMod.VertexData = ^.asInstanceOf[js.Dynamic].applyDynamic("CreatePlaneVertexData")(options.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.babylonjs.meshesMeshDotvertexDataMod.VertexData]

inline def CreatePolygon(name: String, options: Depth): Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreatePolygon")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Mesh]
inline def CreatePolygon(name: String, options: Depth, scene: Unit, earcutInjection: Any): Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreatePolygon")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any], scene.asInstanceOf[js.Any], earcutInjection.asInstanceOf[js.Any])).asInstanceOf[Mesh]
inline def CreatePolygon(name: String, options: Depth, scene: Nullable[Scene]): Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreatePolygon")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any], scene.asInstanceOf[js.Any])).asInstanceOf[Mesh]
inline def CreatePolygon(name: String, options: Depth, scene: Nullable[Scene], earcutInjection: Any): Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreatePolygon")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any], scene.asInstanceOf[js.Any], earcutInjection.asInstanceOf[js.Any])).asInstanceOf[Mesh]

inline def CreatePolygonVertexData(polygon: Mesh, sideOrientation: Double): typingsJapgolly.babylonjs.meshesMeshDotvertexDataMod.VertexData = (^.asInstanceOf[js.Dynamic].applyDynamic("CreatePolygonVertexData")(polygon.asInstanceOf[js.Any], sideOrientation.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.babylonjs.meshesMeshDotvertexDataMod.VertexData]
inline def CreatePolygonVertexData(polygon: Mesh, sideOrientation: Double, fUV: js.Array[Vector4]): typingsJapgolly.babylonjs.meshesMeshDotvertexDataMod.VertexData = (^.asInstanceOf[js.Dynamic].applyDynamic("CreatePolygonVertexData")(polygon.asInstanceOf[js.Any], sideOrientation.asInstanceOf[js.Any], fUV.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.babylonjs.meshesMeshDotvertexDataMod.VertexData]
inline def CreatePolygonVertexData(polygon: Mesh, sideOrientation: Double, fUV: js.Array[Vector4], fColors: js.Array[Color4]): typingsJapgolly.babylonjs.meshesMeshDotvertexDataMod.VertexData = (^.asInstanceOf[js.Dynamic].applyDynamic("CreatePolygonVertexData")(polygon.asInstanceOf[js.Any], sideOrientation.asInstanceOf[js.Any], fUV.asInstanceOf[js.Any], fColors.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.babylonjs.meshesMeshDotvertexDataMod.VertexData]
inline def CreatePolygonVertexData(
  polygon: Mesh,
  sideOrientation: Double,
  fUV: js.Array[Vector4],
  fColors: js.Array[Color4],
  frontUVs: Unit,
  backUVs: Unit,
  wrp: Boolean
): typingsJapgolly.babylonjs.meshesMeshDotvertexDataMod.VertexData = (^.asInstanceOf[js.Dynamic].applyDynamic("CreatePolygonVertexData")(polygon.asInstanceOf[js.Any], sideOrientation.asInstanceOf[js.Any], fUV.asInstanceOf[js.Any], fColors.asInstanceOf[js.Any], frontUVs.asInstanceOf[js.Any], backUVs.asInstanceOf[js.Any], wrp.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.babylonjs.meshesMeshDotvertexDataMod.VertexData]
inline def CreatePolygonVertexData(
  polygon: Mesh,
  sideOrientation: Double,
  fUV: js.Array[Vector4],
  fColors: js.Array[Color4],
  frontUVs: Unit,
  backUVs: Vector4
): typingsJapgolly.babylonjs.meshesMeshDotvertexDataMod.VertexData = (^.asInstanceOf[js.Dynamic].applyDynamic("CreatePolygonVertexData")(polygon.asInstanceOf[js.Any], sideOrientation.asInstanceOf[js.Any], fUV.asInstanceOf[js.Any], fColors.asInstanceOf[js.Any], frontUVs.asInstanceOf[js.Any], backUVs.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.babylonjs.meshesMeshDotvertexDataMod.VertexData]
inline def CreatePolygonVertexData(
  polygon: Mesh,
  sideOrientation: Double,
  fUV: js.Array[Vector4],
  fColors: js.Array[Color4],
  frontUVs: Unit,
  backUVs: Vector4,
  wrp: Boolean
): typingsJapgolly.babylonjs.meshesMeshDotvertexDataMod.VertexData = (^.asInstanceOf[js.Dynamic].applyDynamic("CreatePolygonVertexData")(polygon.asInstanceOf[js.Any], sideOrientation.asInstanceOf[js.Any], fUV.asInstanceOf[js.Any], fColors.asInstanceOf[js.Any], frontUVs.asInstanceOf[js.Any], backUVs.asInstanceOf[js.Any], wrp.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.babylonjs.meshesMeshDotvertexDataMod.VertexData]
inline def CreatePolygonVertexData(
  polygon: Mesh,
  sideOrientation: Double,
  fUV: js.Array[Vector4],
  fColors: js.Array[Color4],
  frontUVs: Vector4
): typingsJapgolly.babylonjs.meshesMeshDotvertexDataMod.VertexData = (^.asInstanceOf[js.Dynamic].applyDynamic("CreatePolygonVertexData")(polygon.asInstanceOf[js.Any], sideOrientation.asInstanceOf[js.Any], fUV.asInstanceOf[js.Any], fColors.asInstanceOf[js.Any], frontUVs.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.babylonjs.meshesMeshDotvertexDataMod.VertexData]
inline def CreatePolygonVertexData(
  polygon: Mesh,
  sideOrientation: Double,
  fUV: js.Array[Vector4],
  fColors: js.Array[Color4],
  frontUVs: Vector4,
  backUVs: Unit,
  wrp: Boolean
): typingsJapgolly.babylonjs.meshesMeshDotvertexDataMod.VertexData = (^.asInstanceOf[js.Dynamic].applyDynamic("CreatePolygonVertexData")(polygon.asInstanceOf[js.Any], sideOrientation.asInstanceOf[js.Any], fUV.asInstanceOf[js.Any], fColors.asInstanceOf[js.Any], frontUVs.asInstanceOf[js.Any], backUVs.asInstanceOf[js.Any], wrp.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.babylonjs.meshesMeshDotvertexDataMod.VertexData]
inline def CreatePolygonVertexData(
  polygon: Mesh,
  sideOrientation: Double,
  fUV: js.Array[Vector4],
  fColors: js.Array[Color4],
  frontUVs: Vector4,
  backUVs: Vector4
): typingsJapgolly.babylonjs.meshesMeshDotvertexDataMod.VertexData = (^.asInstanceOf[js.Dynamic].applyDynamic("CreatePolygonVertexData")(polygon.asInstanceOf[js.Any], sideOrientation.asInstanceOf[js.Any], fUV.asInstanceOf[js.Any], fColors.asInstanceOf[js.Any], frontUVs.asInstanceOf[js.Any], backUVs.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.babylonjs.meshesMeshDotvertexDataMod.VertexData]
inline def CreatePolygonVertexData(
  polygon: Mesh,
  sideOrientation: Double,
  fUV: js.Array[Vector4],
  fColors: js.Array[Color4],
  frontUVs: Vector4,
  backUVs: Vector4,
  wrp: Boolean
): typingsJapgolly.babylonjs.meshesMeshDotvertexDataMod.VertexData = (^.asInstanceOf[js.Dynamic].applyDynamic("CreatePolygonVertexData")(polygon.asInstanceOf[js.Any], sideOrientation.asInstanceOf[js.Any], fUV.asInstanceOf[js.Any], fColors.asInstanceOf[js.Any], frontUVs.asInstanceOf[js.Any], backUVs.asInstanceOf[js.Any], wrp.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.babylonjs.meshesMeshDotvertexDataMod.VertexData]
inline def CreatePolygonVertexData(
  polygon: Mesh,
  sideOrientation: Double,
  fUV: js.Array[Vector4],
  fColors: Unit,
  frontUVs: Unit,
  backUVs: Unit,
  wrp: Boolean
): typingsJapgolly.babylonjs.meshesMeshDotvertexDataMod.VertexData = (^.asInstanceOf[js.Dynamic].applyDynamic("CreatePolygonVertexData")(polygon.asInstanceOf[js.Any], sideOrientation.asInstanceOf[js.Any], fUV.asInstanceOf[js.Any], fColors.asInstanceOf[js.Any], frontUVs.asInstanceOf[js.Any], backUVs.asInstanceOf[js.Any], wrp.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.babylonjs.meshesMeshDotvertexDataMod.VertexData]
inline def CreatePolygonVertexData(
  polygon: Mesh,
  sideOrientation: Double,
  fUV: js.Array[Vector4],
  fColors: Unit,
  frontUVs: Unit,
  backUVs: Vector4
): typingsJapgolly.babylonjs.meshesMeshDotvertexDataMod.VertexData = (^.asInstanceOf[js.Dynamic].applyDynamic("CreatePolygonVertexData")(polygon.asInstanceOf[js.Any], sideOrientation.asInstanceOf[js.Any], fUV.asInstanceOf[js.Any], fColors.asInstanceOf[js.Any], frontUVs.asInstanceOf[js.Any], backUVs.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.babylonjs.meshesMeshDotvertexDataMod.VertexData]
inline def CreatePolygonVertexData(
  polygon: Mesh,
  sideOrientation: Double,
  fUV: js.Array[Vector4],
  fColors: Unit,
  frontUVs: Unit,
  backUVs: Vector4,
  wrp: Boolean
): typingsJapgolly.babylonjs.meshesMeshDotvertexDataMod.VertexData = (^.asInstanceOf[js.Dynamic].applyDynamic("CreatePolygonVertexData")(polygon.asInstanceOf[js.Any], sideOrientation.asInstanceOf[js.Any], fUV.asInstanceOf[js.Any], fColors.asInstanceOf[js.Any], frontUVs.asInstanceOf[js.Any], backUVs.asInstanceOf[js.Any], wrp.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.babylonjs.meshesMeshDotvertexDataMod.VertexData]
inline def CreatePolygonVertexData(polygon: Mesh, sideOrientation: Double, fUV: js.Array[Vector4], fColors: Unit, frontUVs: Vector4): typingsJapgolly.babylonjs.meshesMeshDotvertexDataMod.VertexData = (^.asInstanceOf[js.Dynamic].applyDynamic("CreatePolygonVertexData")(polygon.asInstanceOf[js.Any], sideOrientation.asInstanceOf[js.Any], fUV.asInstanceOf[js.Any], fColors.asInstanceOf[js.Any], frontUVs.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.babylonjs.meshesMeshDotvertexDataMod.VertexData]
inline def CreatePolygonVertexData(
  polygon: Mesh,
  sideOrientation: Double,
  fUV: js.Array[Vector4],
  fColors: Unit,
  frontUVs: Vector4,
  backUVs: Unit,
  wrp: Boolean
): typingsJapgolly.babylonjs.meshesMeshDotvertexDataMod.VertexData = (^.asInstanceOf[js.Dynamic].applyDynamic("CreatePolygonVertexData")(polygon.asInstanceOf[js.Any], sideOrientation.asInstanceOf[js.Any], fUV.asInstanceOf[js.Any], fColors.asInstanceOf[js.Any], frontUVs.asInstanceOf[js.Any], backUVs.asInstanceOf[js.Any], wrp.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.babylonjs.meshesMeshDotvertexDataMod.VertexData]
inline def CreatePolygonVertexData(
  polygon: Mesh,
  sideOrientation: Double,
  fUV: js.Array[Vector4],
  fColors: Unit,
  frontUVs: Vector4,
  backUVs: Vector4
): typingsJapgolly.babylonjs.meshesMeshDotvertexDataMod.VertexData = (^.asInstanceOf[js.Dynamic].applyDynamic("CreatePolygonVertexData")(polygon.asInstanceOf[js.Any], sideOrientation.asInstanceOf[js.Any], fUV.asInstanceOf[js.Any], fColors.asInstanceOf[js.Any], frontUVs.asInstanceOf[js.Any], backUVs.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.babylonjs.meshesMeshDotvertexDataMod.VertexData]
inline def CreatePolygonVertexData(
  polygon: Mesh,
  sideOrientation: Double,
  fUV: js.Array[Vector4],
  fColors: Unit,
  frontUVs: Vector4,
  backUVs: Vector4,
  wrp: Boolean
): typingsJapgolly.babylonjs.meshesMeshDotvertexDataMod.VertexData = (^.asInstanceOf[js.Dynamic].applyDynamic("CreatePolygonVertexData")(polygon.asInstanceOf[js.Any], sideOrientation.asInstanceOf[js.Any], fUV.asInstanceOf[js.Any], fColors.asInstanceOf[js.Any], frontUVs.asInstanceOf[js.Any], backUVs.asInstanceOf[js.Any], wrp.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.babylonjs.meshesMeshDotvertexDataMod.VertexData]
inline def CreatePolygonVertexData(polygon: Mesh, sideOrientation: Double, fUV: Unit, fColors: js.Array[Color4]): typingsJapgolly.babylonjs.meshesMeshDotvertexDataMod.VertexData = (^.asInstanceOf[js.Dynamic].applyDynamic("CreatePolygonVertexData")(polygon.asInstanceOf[js.Any], sideOrientation.asInstanceOf[js.Any], fUV.asInstanceOf[js.Any], fColors.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.babylonjs.meshesMeshDotvertexDataMod.VertexData]
inline def CreatePolygonVertexData(
  polygon: Mesh,
  sideOrientation: Double,
  fUV: Unit,
  fColors: js.Array[Color4],
  frontUVs: Unit,
  backUVs: Unit,
  wrp: Boolean
): typingsJapgolly.babylonjs.meshesMeshDotvertexDataMod.VertexData = (^.asInstanceOf[js.Dynamic].applyDynamic("CreatePolygonVertexData")(polygon.asInstanceOf[js.Any], sideOrientation.asInstanceOf[js.Any], fUV.asInstanceOf[js.Any], fColors.asInstanceOf[js.Any], frontUVs.asInstanceOf[js.Any], backUVs.asInstanceOf[js.Any], wrp.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.babylonjs.meshesMeshDotvertexDataMod.VertexData]
inline def CreatePolygonVertexData(
  polygon: Mesh,
  sideOrientation: Double,
  fUV: Unit,
  fColors: js.Array[Color4],
  frontUVs: Unit,
  backUVs: Vector4
): typingsJapgolly.babylonjs.meshesMeshDotvertexDataMod.VertexData = (^.asInstanceOf[js.Dynamic].applyDynamic("CreatePolygonVertexData")(polygon.asInstanceOf[js.Any], sideOrientation.asInstanceOf[js.Any], fUV.asInstanceOf[js.Any], fColors.asInstanceOf[js.Any], frontUVs.asInstanceOf[js.Any], backUVs.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.babylonjs.meshesMeshDotvertexDataMod.VertexData]
inline def CreatePolygonVertexData(
  polygon: Mesh,
  sideOrientation: Double,
  fUV: Unit,
  fColors: js.Array[Color4],
  frontUVs: Unit,
  backUVs: Vector4,
  wrp: Boolean
): typingsJapgolly.babylonjs.meshesMeshDotvertexDataMod.VertexData = (^.asInstanceOf[js.Dynamic].applyDynamic("CreatePolygonVertexData")(polygon.asInstanceOf[js.Any], sideOrientation.asInstanceOf[js.Any], fUV.asInstanceOf[js.Any], fColors.asInstanceOf[js.Any], frontUVs.asInstanceOf[js.Any], backUVs.asInstanceOf[js.Any], wrp.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.babylonjs.meshesMeshDotvertexDataMod.VertexData]
inline def CreatePolygonVertexData(polygon: Mesh, sideOrientation: Double, fUV: Unit, fColors: js.Array[Color4], frontUVs: Vector4): typingsJapgolly.babylonjs.meshesMeshDotvertexDataMod.VertexData = (^.asInstanceOf[js.Dynamic].applyDynamic("CreatePolygonVertexData")(polygon.asInstanceOf[js.Any], sideOrientation.asInstanceOf[js.Any], fUV.asInstanceOf[js.Any], fColors.asInstanceOf[js.Any], frontUVs.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.babylonjs.meshesMeshDotvertexDataMod.VertexData]
inline def CreatePolygonVertexData(
  polygon: Mesh,
  sideOrientation: Double,
  fUV: Unit,
  fColors: js.Array[Color4],
  frontUVs: Vector4,
  backUVs: Unit,
  wrp: Boolean
): typingsJapgolly.babylonjs.meshesMeshDotvertexDataMod.VertexData = (^.asInstanceOf[js.Dynamic].applyDynamic("CreatePolygonVertexData")(polygon.asInstanceOf[js.Any], sideOrientation.asInstanceOf[js.Any], fUV.asInstanceOf[js.Any], fColors.asInstanceOf[js.Any], frontUVs.asInstanceOf[js.Any], backUVs.asInstanceOf[js.Any], wrp.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.babylonjs.meshesMeshDotvertexDataMod.VertexData]
inline def CreatePolygonVertexData(
  polygon: Mesh,
  sideOrientation: Double,
  fUV: Unit,
  fColors: js.Array[Color4],
  frontUVs: Vector4,
  backUVs: Vector4
): typingsJapgolly.babylonjs.meshesMeshDotvertexDataMod.VertexData = (^.asInstanceOf[js.Dynamic].applyDynamic("CreatePolygonVertexData")(polygon.asInstanceOf[js.Any], sideOrientation.asInstanceOf[js.Any], fUV.asInstanceOf[js.Any], fColors.asInstanceOf[js.Any], frontUVs.asInstanceOf[js.Any], backUVs.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.babylonjs.meshesMeshDotvertexDataMod.VertexData]
inline def CreatePolygonVertexData(
  polygon: Mesh,
  sideOrientation: Double,
  fUV: Unit,
  fColors: js.Array[Color4],
  frontUVs: Vector4,
  backUVs: Vector4,
  wrp: Boolean
): typingsJapgolly.babylonjs.meshesMeshDotvertexDataMod.VertexData = (^.asInstanceOf[js.Dynamic].applyDynamic("CreatePolygonVertexData")(polygon.asInstanceOf[js.Any], sideOrientation.asInstanceOf[js.Any], fUV.asInstanceOf[js.Any], fColors.asInstanceOf[js.Any], frontUVs.asInstanceOf[js.Any], backUVs.asInstanceOf[js.Any], wrp.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.babylonjs.meshesMeshDotvertexDataMod.VertexData]
inline def CreatePolygonVertexData(
  polygon: Mesh,
  sideOrientation: Double,
  fUV: Unit,
  fColors: Unit,
  frontUVs: Unit,
  backUVs: Unit,
  wrp: Boolean
): typingsJapgolly.babylonjs.meshesMeshDotvertexDataMod.VertexData = (^.asInstanceOf[js.Dynamic].applyDynamic("CreatePolygonVertexData")(polygon.asInstanceOf[js.Any], sideOrientation.asInstanceOf[js.Any], fUV.asInstanceOf[js.Any], fColors.asInstanceOf[js.Any], frontUVs.asInstanceOf[js.Any], backUVs.asInstanceOf[js.Any], wrp.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.babylonjs.meshesMeshDotvertexDataMod.VertexData]
inline def CreatePolygonVertexData(polygon: Mesh, sideOrientation: Double, fUV: Unit, fColors: Unit, frontUVs: Unit, backUVs: Vector4): typingsJapgolly.babylonjs.meshesMeshDotvertexDataMod.VertexData = (^.asInstanceOf[js.Dynamic].applyDynamic("CreatePolygonVertexData")(polygon.asInstanceOf[js.Any], sideOrientation.asInstanceOf[js.Any], fUV.asInstanceOf[js.Any], fColors.asInstanceOf[js.Any], frontUVs.asInstanceOf[js.Any], backUVs.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.babylonjs.meshesMeshDotvertexDataMod.VertexData]
inline def CreatePolygonVertexData(
  polygon: Mesh,
  sideOrientation: Double,
  fUV: Unit,
  fColors: Unit,
  frontUVs: Unit,
  backUVs: Vector4,
  wrp: Boolean
): typingsJapgolly.babylonjs.meshesMeshDotvertexDataMod.VertexData = (^.asInstanceOf[js.Dynamic].applyDynamic("CreatePolygonVertexData")(polygon.asInstanceOf[js.Any], sideOrientation.asInstanceOf[js.Any], fUV.asInstanceOf[js.Any], fColors.asInstanceOf[js.Any], frontUVs.asInstanceOf[js.Any], backUVs.asInstanceOf[js.Any], wrp.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.babylonjs.meshesMeshDotvertexDataMod.VertexData]
inline def CreatePolygonVertexData(polygon: Mesh, sideOrientation: Double, fUV: Unit, fColors: Unit, frontUVs: Vector4): typingsJapgolly.babylonjs.meshesMeshDotvertexDataMod.VertexData = (^.asInstanceOf[js.Dynamic].applyDynamic("CreatePolygonVertexData")(polygon.asInstanceOf[js.Any], sideOrientation.asInstanceOf[js.Any], fUV.asInstanceOf[js.Any], fColors.asInstanceOf[js.Any], frontUVs.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.babylonjs.meshesMeshDotvertexDataMod.VertexData]
inline def CreatePolygonVertexData(
  polygon: Mesh,
  sideOrientation: Double,
  fUV: Unit,
  fColors: Unit,
  frontUVs: Vector4,
  backUVs: Unit,
  wrp: Boolean
): typingsJapgolly.babylonjs.meshesMeshDotvertexDataMod.VertexData = (^.asInstanceOf[js.Dynamic].applyDynamic("CreatePolygonVertexData")(polygon.asInstanceOf[js.Any], sideOrientation.asInstanceOf[js.Any], fUV.asInstanceOf[js.Any], fColors.asInstanceOf[js.Any], frontUVs.asInstanceOf[js.Any], backUVs.asInstanceOf[js.Any], wrp.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.babylonjs.meshesMeshDotvertexDataMod.VertexData]
inline def CreatePolygonVertexData(
  polygon: Mesh,
  sideOrientation: Double,
  fUV: Unit,
  fColors: Unit,
  frontUVs: Vector4,
  backUVs: Vector4
): typingsJapgolly.babylonjs.meshesMeshDotvertexDataMod.VertexData = (^.asInstanceOf[js.Dynamic].applyDynamic("CreatePolygonVertexData")(polygon.asInstanceOf[js.Any], sideOrientation.asInstanceOf[js.Any], fUV.asInstanceOf[js.Any], fColors.asInstanceOf[js.Any], frontUVs.asInstanceOf[js.Any], backUVs.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.babylonjs.meshesMeshDotvertexDataMod.VertexData]
inline def CreatePolygonVertexData(
  polygon: Mesh,
  sideOrientation: Double,
  fUV: Unit,
  fColors: Unit,
  frontUVs: Vector4,
  backUVs: Vector4,
  wrp: Boolean
): typingsJapgolly.babylonjs.meshesMeshDotvertexDataMod.VertexData = (^.asInstanceOf[js.Dynamic].applyDynamic("CreatePolygonVertexData")(polygon.asInstanceOf[js.Any], sideOrientation.asInstanceOf[js.Any], fUV.asInstanceOf[js.Any], fColors.asInstanceOf[js.Any], frontUVs.asInstanceOf[js.Any], backUVs.asInstanceOf[js.Any], wrp.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.babylonjs.meshesMeshDotvertexDataMod.VertexData]

inline def CreatePolyhedron(name: String): Mesh = ^.asInstanceOf[js.Dynamic].applyDynamic("CreatePolyhedron")(name.asInstanceOf[js.Any]).asInstanceOf[Mesh]
inline def CreatePolyhedron(name: String, options: Unit, scene: Nullable[Scene]): Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreatePolyhedron")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any], scene.asInstanceOf[js.Any])).asInstanceOf[Mesh]
inline def CreatePolyhedron(name: String, options: Custom): Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreatePolyhedron")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Mesh]
inline def CreatePolyhedron(name: String, options: Custom, scene: Nullable[Scene]): Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreatePolyhedron")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any], scene.asInstanceOf[js.Any])).asInstanceOf[Mesh]

inline def CreatePolyhedronVertexData(options: FaceUV): typingsJapgolly.babylonjs.meshesMeshDotvertexDataMod.VertexData = ^.asInstanceOf[js.Dynamic].applyDynamic("CreatePolyhedronVertexData")(options.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.babylonjs.meshesMeshDotvertexDataMod.VertexData]

inline def CreateRibbon(name: String, options: CloseArray): Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateRibbon")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Mesh]
inline def CreateRibbon(name: String, options: CloseArray, scene: Nullable[Scene]): Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateRibbon")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any], scene.asInstanceOf[js.Any])).asInstanceOf[Mesh]

inline def CreateRibbonVertexData(options: ClosePath): typingsJapgolly.babylonjs.meshesMeshDotvertexDataMod.VertexData = ^.asInstanceOf[js.Dynamic].applyDynamic("CreateRibbonVertexData")(options.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.babylonjs.meshesMeshDotvertexDataMod.VertexData]

inline def CreateSphere(name: String): Mesh = ^.asInstanceOf[js.Dynamic].applyDynamic("CreateSphere")(name.asInstanceOf[js.Any]).asInstanceOf[Mesh]
inline def CreateSphere(name: String, options: Unit, scene: Nullable[Scene]): Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateSphere")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any], scene.asInstanceOf[js.Any])).asInstanceOf[Mesh]
inline def CreateSphere(name: String, options: DiameterX): Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateSphere")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Mesh]
inline def CreateSphere(name: String, options: DiameterX, scene: Nullable[Scene]): Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateSphere")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any], scene.asInstanceOf[js.Any])).asInstanceOf[Mesh]

inline def CreateSphereVertexData(options: DedupTopBottomIndices): typingsJapgolly.babylonjs.meshesMeshDotvertexDataMod.VertexData = ^.asInstanceOf[js.Dynamic].applyDynamic("CreateSphereVertexData")(options.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.babylonjs.meshesMeshDotvertexDataMod.VertexData]

inline def CreateTiledBox(name: String, options: AlignHorizontal): Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateTiledBox")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Mesh]
inline def CreateTiledBox(name: String, options: AlignHorizontal, scene: Nullable[Scene]): Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateTiledBox")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any], scene.asInstanceOf[js.Any])).asInstanceOf[Mesh]

inline def CreateTiledBoxVertexData(options: AlignVertical): typingsJapgolly.babylonjs.meshesMeshDotvertexDataMod.VertexData = ^.asInstanceOf[js.Dynamic].applyDynamic("CreateTiledBoxVertexData")(options.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.babylonjs.meshesMeshDotvertexDataMod.VertexData]

inline def CreateTiledGround(name: String, options: Precision): Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateTiledGround")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Mesh]
inline def CreateTiledGround(name: String, options: Precision, scene: Nullable[Scene]): Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateTiledGround")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any], scene.asInstanceOf[js.Any])).asInstanceOf[Mesh]

inline def CreateTiledGroundVertexData(options: Xmax): typingsJapgolly.babylonjs.meshesMeshDotvertexDataMod.VertexData = ^.asInstanceOf[js.Dynamic].applyDynamic("CreateTiledGroundVertexData")(options.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.babylonjs.meshesMeshDotvertexDataMod.VertexData]

inline def CreateTiledPlane(name: String, options: Pattern): Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateTiledPlane")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Mesh]
inline def CreateTiledPlane(name: String, options: Pattern, scene: Nullable[Scene]): Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateTiledPlane")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any], scene.asInstanceOf[js.Any])).asInstanceOf[Mesh]

inline def CreateTiledPlaneVertexData(options: TileHeight): typingsJapgolly.babylonjs.meshesMeshDotvertexDataMod.VertexData = ^.asInstanceOf[js.Dynamic].applyDynamic("CreateTiledPlaneVertexData")(options.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.babylonjs.meshesMeshDotvertexDataMod.VertexData]

inline def CreateTorus(name: String): Mesh = ^.asInstanceOf[js.Dynamic].applyDynamic("CreateTorus")(name.asInstanceOf[js.Any]).asInstanceOf[Mesh]
inline def CreateTorus(name: String, options: Unit, scene: Scene): Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateTorus")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any], scene.asInstanceOf[js.Any])).asInstanceOf[Mesh]
inline def CreateTorus(name: String, options: Tessellation): Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateTorus")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Mesh]
inline def CreateTorus(name: String, options: Tessellation, scene: Scene): Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateTorus")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any], scene.asInstanceOf[js.Any])).asInstanceOf[Mesh]

inline def CreateTorusKnot(name: String): Mesh = ^.asInstanceOf[js.Dynamic].applyDynamic("CreateTorusKnot")(name.asInstanceOf[js.Any]).asInstanceOf[Mesh]
inline def CreateTorusKnot(name: String, options: Unit, scene: Scene): Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateTorusKnot")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any], scene.asInstanceOf[js.Any])).asInstanceOf[Mesh]
inline def CreateTorusKnot(name: String, options: P): Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateTorusKnot")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Mesh]
inline def CreateTorusKnot(name: String, options: P, scene: Scene): Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateTorusKnot")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any], scene.asInstanceOf[js.Any])).asInstanceOf[Mesh]

inline def CreateTorusKnotVertexData(options: Q): typingsJapgolly.babylonjs.meshesMeshDotvertexDataMod.VertexData = ^.asInstanceOf[js.Dynamic].applyDynamic("CreateTorusKnotVertexData")(options.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.babylonjs.meshesMeshDotvertexDataMod.VertexData]

inline def CreateTorusVertexData(options: Thickness): typingsJapgolly.babylonjs.meshesMeshDotvertexDataMod.VertexData = ^.asInstanceOf[js.Dynamic].applyDynamic("CreateTorusVertexData")(options.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.babylonjs.meshesMeshDotvertexDataMod.VertexData]

inline def CreateTube(name: String, options: InvertUV): Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateTube")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Mesh]
inline def CreateTube(name: String, options: InvertUV, scene: Nullable[Scene]): Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateTube")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any], scene.asInstanceOf[js.Any])).asInstanceOf[Mesh]

inline def ExtrudePolygon(name: String, options: Holes): Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("ExtrudePolygon")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Mesh]
inline def ExtrudePolygon(name: String, options: Holes, scene: Unit, earcutInjection: Any): Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("ExtrudePolygon")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any], scene.asInstanceOf[js.Any], earcutInjection.asInstanceOf[js.Any])).asInstanceOf[Mesh]
inline def ExtrudePolygon(name: String, options: Holes, scene: Nullable[Scene]): Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("ExtrudePolygon")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any], scene.asInstanceOf[js.Any])).asInstanceOf[Mesh]
inline def ExtrudePolygon(name: String, options: Holes, scene: Nullable[Scene], earcutInjection: Any): Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("ExtrudePolygon")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any], scene.asInstanceOf[js.Any], earcutInjection.asInstanceOf[js.Any])).asInstanceOf[Mesh]

inline def ExtrudeShape(name: String, options: AdjustFrame): Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("ExtrudeShape")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Mesh]
inline def ExtrudeShape(name: String, options: AdjustFrame, scene: Nullable[Scene]): Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("ExtrudeShape")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any], scene.asInstanceOf[js.Any])).asInstanceOf[Mesh]

inline def ExtrudeShapeCustom(name: String, options: CloseShape): Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("ExtrudeShapeCustom")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Mesh]
inline def ExtrudeShapeCustom(name: String, options: CloseShape, scene: Nullable[Scene]): Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("ExtrudeShapeCustom")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any], scene.asInstanceOf[js.Any])).asInstanceOf[Mesh]
