package typingsJapgolly.winrtUwp.Windows.Graphics.Printing3D

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.winrtUwp.Windows.Foundation.Collections.IPropertySet
import typingsJapgolly.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import typingsJapgolly.winrtUwp.Windows.Storage.Streams.IBuffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a mesh in the 3D model. */
trait Printing3DMesh extends StObject {
  
  /** Gets a set of mesh buffer descriptions. */
  var bufferDescriptionSet: IPropertySet
  
  /** Gets a set of mesh buffers. */
  var bufferSet: IPropertySet
  
  /**
    * Creates the buffer for triangle indices.
    * @param value The capacity of the buffer, the maximum number of bytes that the IBuffer can hold.
    */
  def createTriangleIndices(value: Double): Unit
  
  /**
    * Creates the buffer for triangle material indices.
    * @param value The capacity of the buffer, the maximum number of bytes that the IBuffer can hold.
    */
  def createTriangleMaterialIndices(value: Double): Unit
  
  /**
    * Creates the buffer for vertex normals.
    * @param value The capacity of the buffer, the maximum number of bytes that the IBuffer can hold.
    */
  def createVertexNormals(value: Double): Unit
  
  /**
    * Creates the buffer for vertex positions.
    * @param value The capacity of the buffer, the maximum number of bytes that the IBuffer can hold.
    */
  def createVertexPositions(value: Double): Unit
  
  /**
    * Gets the buffer for triangle indices.
    * @return The buffer for triangle indices.
    */
  def getTriangleIndices(): IBuffer
  
  /**
    * Gets the buffer for triangle material indices.
    * @return The buffer for triangle material indices.
    */
  def getTriangleMaterialIndices(): IBuffer
  
  /**
    * Gets the buffer for vertex normals.
    * @return The buffer for vertex normals.
    */
  def getVertexNormals(): IBuffer
  
  /**
    * Gets the buffer for vertex positions.
    * @return The buffer for vertex positions.
    */
  def getVertexPositions(): IBuffer
  
  /** Gets or sets the number of triangle indices. */
  var indexCount: Double
  
  /** Gets or sets the buffer description for triangle indices. */
  var triangleIndicesDescription: Printing3DBufferDescription
  
  /** Gets or sets the buffer description for triangle material indices. */
  var triangleMaterialIndicesDescription: Printing3DBufferDescription
  
  /**
    * Verifies the mesh has manifold edges and normal triangles.
    * @param value Specifies how the mesh is verified.
    * @return The results of the verification, of type Printing3DMeshVerificationResult .
    */
  def verifyAsync(value: Printing3DMeshVerificationMode): IPromiseWithIAsyncOperation[Printing3DMeshVerificationResult]
  
  /** Gets or sets the number of triangle vertices. */
  var vertexCount: Double
  
  /** Gets or sets the buffer description for vertex normals. */
  var vertexNormalsDescription: Printing3DBufferDescription
  
  /** Gets or sets the buffer description for vertex positions. */
  var vertexPositionsDescription: Printing3DBufferDescription
}
object Printing3DMesh {
  
  inline def apply(
    bufferDescriptionSet: IPropertySet,
    bufferSet: IPropertySet,
    createTriangleIndices: Double => Callback,
    createTriangleMaterialIndices: Double => Callback,
    createVertexNormals: Double => Callback,
    createVertexPositions: Double => Callback,
    getTriangleIndices: CallbackTo[IBuffer],
    getTriangleMaterialIndices: CallbackTo[IBuffer],
    getVertexNormals: CallbackTo[IBuffer],
    getVertexPositions: CallbackTo[IBuffer],
    indexCount: Double,
    triangleIndicesDescription: Printing3DBufferDescription,
    triangleMaterialIndicesDescription: Printing3DBufferDescription,
    verifyAsync: Printing3DMeshVerificationMode => IPromiseWithIAsyncOperation[Printing3DMeshVerificationResult],
    vertexCount: Double,
    vertexNormalsDescription: Printing3DBufferDescription,
    vertexPositionsDescription: Printing3DBufferDescription
  ): Printing3DMesh = {
    val __obj = js.Dynamic.literal(bufferDescriptionSet = bufferDescriptionSet.asInstanceOf[js.Any], bufferSet = bufferSet.asInstanceOf[js.Any], createTriangleIndices = js.Any.fromFunction1((t0: Double) => createTriangleIndices(t0).runNow()), createTriangleMaterialIndices = js.Any.fromFunction1((t0: Double) => createTriangleMaterialIndices(t0).runNow()), createVertexNormals = js.Any.fromFunction1((t0: Double) => createVertexNormals(t0).runNow()), createVertexPositions = js.Any.fromFunction1((t0: Double) => createVertexPositions(t0).runNow()), getTriangleIndices = getTriangleIndices.toJsFn, getTriangleMaterialIndices = getTriangleMaterialIndices.toJsFn, getVertexNormals = getVertexNormals.toJsFn, getVertexPositions = getVertexPositions.toJsFn, indexCount = indexCount.asInstanceOf[js.Any], triangleIndicesDescription = triangleIndicesDescription.asInstanceOf[js.Any], triangleMaterialIndicesDescription = triangleMaterialIndicesDescription.asInstanceOf[js.Any], verifyAsync = js.Any.fromFunction1(verifyAsync), vertexCount = vertexCount.asInstanceOf[js.Any], vertexNormalsDescription = vertexNormalsDescription.asInstanceOf[js.Any], vertexPositionsDescription = vertexPositionsDescription.asInstanceOf[js.Any])
    __obj.asInstanceOf[Printing3DMesh]
  }
  
  extension [Self <: Printing3DMesh](x: Self) {
    
    inline def setBufferDescriptionSet(value: IPropertySet): Self = StObject.set(x, "bufferDescriptionSet", value.asInstanceOf[js.Any])
    
    inline def setBufferSet(value: IPropertySet): Self = StObject.set(x, "bufferSet", value.asInstanceOf[js.Any])
    
    inline def setCreateTriangleIndices(value: Double => Callback): Self = StObject.set(x, "createTriangleIndices", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
    
    inline def setCreateTriangleMaterialIndices(value: Double => Callback): Self = StObject.set(x, "createTriangleMaterialIndices", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
    
    inline def setCreateVertexNormals(value: Double => Callback): Self = StObject.set(x, "createVertexNormals", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
    
    inline def setCreateVertexPositions(value: Double => Callback): Self = StObject.set(x, "createVertexPositions", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
    
    inline def setGetTriangleIndices(value: CallbackTo[IBuffer]): Self = StObject.set(x, "getTriangleIndices", value.toJsFn)
    
    inline def setGetTriangleMaterialIndices(value: CallbackTo[IBuffer]): Self = StObject.set(x, "getTriangleMaterialIndices", value.toJsFn)
    
    inline def setGetVertexNormals(value: CallbackTo[IBuffer]): Self = StObject.set(x, "getVertexNormals", value.toJsFn)
    
    inline def setGetVertexPositions(value: CallbackTo[IBuffer]): Self = StObject.set(x, "getVertexPositions", value.toJsFn)
    
    inline def setIndexCount(value: Double): Self = StObject.set(x, "indexCount", value.asInstanceOf[js.Any])
    
    inline def setTriangleIndicesDescription(value: Printing3DBufferDescription): Self = StObject.set(x, "triangleIndicesDescription", value.asInstanceOf[js.Any])
    
    inline def setTriangleMaterialIndicesDescription(value: Printing3DBufferDescription): Self = StObject.set(x, "triangleMaterialIndicesDescription", value.asInstanceOf[js.Any])
    
    inline def setVerifyAsync(
      value: Printing3DMeshVerificationMode => IPromiseWithIAsyncOperation[Printing3DMeshVerificationResult]
    ): Self = StObject.set(x, "verifyAsync", js.Any.fromFunction1(value))
    
    inline def setVertexCount(value: Double): Self = StObject.set(x, "vertexCount", value.asInstanceOf[js.Any])
    
    inline def setVertexNormalsDescription(value: Printing3DBufferDescription): Self = StObject.set(x, "vertexNormalsDescription", value.asInstanceOf[js.Any])
    
    inline def setVertexPositionsDescription(value: Printing3DBufferDescription): Self = StObject.set(x, "vertexPositionsDescription", value.asInstanceOf[js.Any])
  }
}
